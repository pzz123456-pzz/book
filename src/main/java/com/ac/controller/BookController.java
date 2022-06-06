package com.ac.controller;

import com.ac.dto.BookDto;
import com.ac.entity.Book;
import com.ac.entity.User;
import com.ac.exception.BookException;
import com.ac.service.BookService;
import com.ac.service.UserService;
import com.ac.util.BookError;
import com.ac.util.ResponseResult;
import com.ac.util.ResponseResultUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhanzheng.pang
 * @time: 2021/10/19
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    /**
     * 当月借阅的最多的书
        * @Param:
        * @return: java.lang.String
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 16:52
    */
    @PostMapping("/bookMax")
    public List<String> bookMax(){
        List<Integer> list = bookService.bookMax();
        List<String> books = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(0));
            Book book = bookService.selectById(list.get(i));
            books.add(book.getBookName());
        }
        return books;
    }

    /**
     * 当月最多的借阅的人
        * @Param:
        * @return: java.lang.String
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 16:52
    */
    @PostMapping("/userMax")
    public List<String> userMax(){
        List<Integer> list = bookService.userMax();
        List<String> users = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(0));
            User user = userService.selectById(list.get(i));
            users.add(user.getUserName());
        }
        return users;
    }

    /**
        * @Param: bookDto  , errors
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/20 10:07
    */
    @PostMapping("/insert")
    public int insertBook(@Validated @RequestBody BookDto bookDto, Errors errors){
        if (errors.hasErrors()) {
            throw new BookException(errors);
        }
        Book book = new Book();
        BeanUtils.copyProperties(bookDto, book);
        book.setDeleteFlag(false);
        return bookService.insertBook(book);
    }

    /**
        * @Param: book
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/20 10:07
    */
    @PostMapping("/update")
    public int updateBookById(@RequestBody Book book){
        return bookService.updateById(book);
    }


    /**
     * 借阅
        * @Param: bookId
        * @return: com.ac.util.ResponseResult
        * @Author: zhanzheng.pang
        * @Date: 2021/10/20 16:07
    */
    @PostMapping("/updateQuantity")
    public ResponseResult updateQuantityById(int userId,int bookId){
        int maxId = bookService.selectMaxId();
        int minId = bookService.selectMinId();
        if (maxId < bookId || bookId < minId){
            return ResponseResultUtil.fail("不存在这个书");
        }
        int i = bookService.updateQuantity(userId,bookId);
        String code = BookError.ERROR_4.getCode();
        if (i == Integer.parseInt(code)) {
            System.out.println("没库存了");
            return ResponseResultUtil.fail("没库存了");
        }
        if (i == Integer.parseInt(BookError.ERROR_6.getCode())){
            return ResponseResultUtil.fail("上一本一样的书还没还，不借！");
        }
        return ResponseResultUtil.success(i);
    }

    /**
     * 归还
        * @Param: bookId
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/20 16:14
    */
    @PostMapping("/updateQuantityReturn")
    public ResponseResult updateQuantityByIdReturn(int userId,int bookId){
        if (bookService.updateQuantityReturn(userId,bookId) == Integer.parseInt(BookError.ERROR_5.getCode())){
            return ResponseResultUtil.fail("已经归还过了");
        }
        int i = bookService.updateQuantityReturn(userId, bookId);
        return ResponseResultUtil.success(i);
    }


    /**
        * @Param: bookIdList
        * @return: java.util.List<com.ac.entity.Book>
        * @Author: zhanzheng.pang
        * @Date: 2021/10/20 10:07
    */
    @PostMapping("/selectById")
    public List<Book> selectById(@RequestBody List<Integer> bookIdList){
        List<Book> list = new ArrayList<>();
        int maxBookId = bookService.selectMaxId();
        int minBookId = bookService.selectMinId();
        for (int bookId:bookIdList){
            if (maxBookId >= bookId && minBookId <= bookId){
                Book book = bookService.selectById(bookId);
                if (!book.getDeleteFlag()){
                    list.add(book);
                }
            }
        }
        return list;
    }

    @PostMapping("/selectByExample")
    public List<Book> selectByExample(@RequestBody Book book){
        List<Book> books = new ArrayList<>();
        List<Book> list = bookService.selectByExample(book);
        for (Book b:list){
            if (!b.getDeleteFlag()){
                books.add(b);
            }
        }
        return books;
    }


    /**
     * 逻辑删除
        * @Param: book
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/20 10:07
    */
    @GetMapping("/updateDeleteFlag")
    public int updateDeleteFlag(@RequestBody Book book) {
        return bookService.updateDeleteFlag(book);
    }


}


