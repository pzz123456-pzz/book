package com.ac.service.impl;

import com.ac.entity.Book;
import com.ac.entity.BookExample;
import com.ac.entity.BorrowHistory;
import com.ac.entity.BorrowHistoryExample;
import com.ac.mapper.BookMapper;
import com.ac.mapper.BorrowHistoryMapper;
import com.ac.service.BookService;
import com.ac.util.BookError;
import com.ac.util.ResponseResult;
import com.ac.util.ResponseResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author: zhanzheng.pang
 * @time: 2021/10/19
 */
@Service
public class BookServiceImpl  implements BookService{

    @Resource
    BookMapper bookMapper;

    @Resource
    BorrowHistoryMapper borrowHistoryMapper;

    @Override
    public  List<Integer> bookMax() {
        return bookMapper.bookMax();
    }

    @Override
    public List<Integer> userMax() {
        return bookMapper.userMax();
    }

    @Override
    public int insertBook(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int deleteBookById(int bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int updateById(Book book) {
        book.setUpdateDateTime(new Date());
        return bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public Book selectById(int bookId) {
        Book book1 = bookMapper.selectByPrimaryKey(bookId);
        return book1;
    }

    @Override
    public List<Book> selectByExample(Book book) {
        BookExample example = new BookExample();
        BookExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(book.getAuthorName())){
            criteria.andAuthorNameLike("%" + book.getAuthorName() + "%");
        }
        if (StringUtils.isNotBlank(book.getBookName())){
            criteria.andBookNameLike("%" + book.getBookName() + "%");
        }
        if (StringUtils.isNotBlank(book.getPublisherName())){
            criteria.andPublisherNameLike("%" + book.getPublisherName() + "%");
        }
        if (!(book.getBookId() == null)){
            criteria.andBookIdEqualTo(book.getBookId());
        }
        return bookMapper.selectByExample(example);
    }

    @Override
    public int updateDeleteFlag(Book book) {
        book.setDeleteFlag(true);
        return bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public int updateQuantity(int userId,int bookId) {
        Book book = selectById(bookId);
        int quantity = book.getQuantity();
        //       判断库存是否大于0
        if (quantity > 0){
            quantity = quantity -1;
        }else {
            ResponseResult responseResult;
            responseResult = ResponseResultUtil.fail(BookError.ERROR_4);
            System.out.println(responseResult.getCode());
            return Integer.parseInt(responseResult.getCode());
        }
        book.setQuantity(quantity);
        book.setUpdateDateTime(new Date());
//        判断这本书是否已归还
        BorrowHistoryExample borrowHistoryExample = new BorrowHistoryExample();
        BorrowHistoryExample.Criteria criteria = borrowHistoryExample.createCriteria();
        if (!(userId == -1)){
            criteria.andUserIdEqualTo(userId);
        }
        if (!(bookId == -1)){
            criteria.andBookIdEqualTo(bookId);
        }
        List<BorrowHistory> borrowHistories = borrowHistoryMapper.selectByExample(borrowHistoryExample);
        for(BorrowHistory borrowHistory:borrowHistories) {
            if (!(borrowHistory.getReturnDate() == null)) {
                System.out.println(quantity+"-------------------");
            }else {
                ResponseResult responseResult;
                responseResult = ResponseResultUtil.fail(BookError.ERROR_6);
                System.out.println(quantity+"=============");
                String code = responseResult.getCode();
                return Integer.parseInt(code);
            }
        }

//        写入历史表
        BorrowHistory history = new BorrowHistory();
        history.setBorrowDate(new Date());
        history.setCreateDateTime(new Date());
        history.setUpdateDateTime(new Date());
        history.setUserId(userId);
        history.setBookId(bookId);
        history.setDeleteFlag(false);
        borrowHistoryMapper.insert(history);
        int i = bookMapper.updateByPrimaryKeySelective(book);
        return i;
    }

    @Override
    public int updateQuantityReturn(int userId,int bookId) {
        Book book = selectById(bookId);
        int quantity = book.getQuantity();
        quantity = quantity + 1;
        System.out.println(quantity);
        book.setQuantity(quantity);
        book.setUpdateDateTime(new Date());

//        写入history表
        BorrowHistoryExample borrowHistoryExample = new BorrowHistoryExample();
        BorrowHistoryExample.Criteria criteria = borrowHistoryExample.createCriteria();
       if (!(userId == -1)){
           criteria.andUserIdEqualTo(userId);
       }
        if (!(bookId == -1)){
            criteria.andBookIdEqualTo(bookId);
        }
        List<BorrowHistory> borrowHistories = borrowHistoryMapper.selectByExample(borrowHistoryExample);
        for (int i = 0; i < borrowHistories.size(); i++) {
            if (borrowHistories.get(i).getReturnDate() == null){
                borrowHistories.get(i).setUpdateDateTime(new Date());
                borrowHistories.get(i).setReturnDate(new Date());
                borrowHistoryMapper.updateByPrimaryKeySelective(borrowHistories.get(i));
                return bookMapper.updateByPrimaryKeySelective(book);
            }
        }
            ResponseResult responseResult;
            responseResult = ResponseResultUtil.fail(BookError.ERROR_5);
            return Integer.parseInt(responseResult.getCode());
    }


    @Override
    public int selectMaxId() {
        return bookMapper.selectMax();
    }

    @Override
    public int selectMinId() {
        return bookMapper.selectMin();
    }

}
