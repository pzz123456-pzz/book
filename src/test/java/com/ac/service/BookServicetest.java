package com.ac.service;

import com.ac.entity.Book;
import com.ac.entity.BorrowHistory;
import com.ac.entity.User;
import com.ac.mapper.BookMapper;
import com.ac.mapper.BorrowHistoryMapper;
import com.ac.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhanzheng.pang
 * @time: 2021/10/22
 */


@ExtendWith(MockitoExtension.class)
public class BookServicetest {

    @InjectMocks
    private BookServiceImpl bookService;

    @Mock
    private BookMapper bookMapper;

    @Mock
    private BorrowHistoryMapper borrowHistoryMapper;

    @Test
    public void insertBook(){
        Mockito.when(bookMapper.insert(Mockito.any())).thenReturn(1);
        int i = bookService.insertBook(new Book());
        Assertions.assertEquals(i, 1);
    }

    @Test
    public void updateById(){
        Mockito.when(bookMapper.updateByPrimaryKeySelective(Mockito.any())).thenReturn(1);
        int i = bookService.updateById(new Book());
        Assertions.assertEquals(i, 1);
    }

    @Test
    public void updateDeleteFlag(){
        Mockito.when(bookMapper.updateByPrimaryKeySelective(Mockito.any())).thenReturn(1);
        int i = bookService.updateDeleteFlag(new Book());
        Assertions.assertEquals(i, 1);
    }

    @Test
    public void updateQuantity(){
        List<BorrowHistory> list = new ArrayList<>();
        Book book = new Book();
        book.setBookId(2);
        book.setQuantity(90);
        User user = new User();
        user.setUserId(1);
        Mockito.when(bookMapper.selectByPrimaryKey(Mockito.any())).thenReturn(book);
        Mockito.when(borrowHistoryMapper.selectByExample(Mockito.any())).thenReturn(list);
        Mockito.when(bookMapper.updateByPrimaryKeySelective(Mockito.any())).thenReturn(1);
        int i = bookService.updateQuantity(user.getUserId(),book.getBookId());
        Assertions.assertEquals(i, 1);
    }

    @Test
    public void updateQuantityReturn(){
        List<BorrowHistory> list = new ArrayList<>();
        BorrowHistory borrowHistory = new BorrowHistory();
        Book book = new Book();
        book.setBookId(4);
        book.setQuantity(90);
        User user = new User();
        user.setUserId(2);
        Mockito.when(bookMapper.selectByPrimaryKey(Mockito.any())).thenReturn(book);
        Mockito.when(borrowHistoryMapper.selectByExample(Mockito.any())).thenReturn(list);
//        Mockito.when(borrowHistoryMapper.updateByPrimaryKeySelective(Mockito.any())).thenReturn(1);
//            Mockito.when(bookMapper.updateByPrimaryKeySelective(Mockito.any())).thenReturn(1);
            int i = bookService.updateQuantityReturn(user.getUserId(), book.getBookId());
            Assertions.assertEquals(5,i);
    }

    @Test
    public void bookMax(){
        List<Integer> list = new ArrayList<>();
        Mockito.when(bookMapper.bookMax()).thenReturn(list);
        List<Integer> list1 = bookService.bookMax();
        Assertions.assertEquals(list1, list);
    }

    @Test
    public void userMax(){
        List<Integer> list = new ArrayList<>();
        Mockito.when(bookMapper.userMax()).thenReturn(list);
        List<Integer> list1 = bookService.userMax();
        Assertions.assertEquals(list1, list);
    }

    @Test
    public void selectMaxId(){
        Mockito.when(bookMapper.selectMax()).thenReturn(1);
        int i = bookService.selectMaxId();
        Assertions.assertEquals(i, 1);
    }

    @Test
    public void selectMinId(){
        Mockito.when(bookMapper.selectMin()).thenReturn(1);
        int i = bookService.selectMinId();
        Assertions.assertEquals(i, 1);
    }

    @Test
    public void selectById(){
        Book book = new Book();
        book.setBookId(2);
        Mockito.when(bookMapper.selectByPrimaryKey(Mockito.any())).thenReturn(book);
        Book book1 = bookService.selectById(book.getBookId());
        Assertions.assertEquals(book1,book);
    }

    @Test
    public void selectByExample(){
        List<Book> list = new ArrayList<>();
        Book bookExample = new Book();
        Mockito.when(bookMapper.selectByExample(Mockito.any())).thenReturn(list);
        List<Book> list1 = bookService.selectByExample(bookExample);
        Assertions.assertEquals(list1,list);
    }

}
