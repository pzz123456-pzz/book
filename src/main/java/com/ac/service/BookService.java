package com.ac.service;

import com.ac.entity.Book;

import java.util.List;

/**
 * @author: zhanzheng.pang
 * @time: 2021/10/19
 */
public interface BookService {

    List<Integer> bookMax(); //ok

    List<Integer> userMax();  //ok
    /**
     * 新增图书信息
        * @Param: book
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:17
    */
    int insertBook(Book book);  //ok

    /**
     * 根据bookId物理删除图书
        * @Param: bookId
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:18
    */
    int deleteBookById(int bookId);

    /**
     * 根据bookId修改book信息
        * @Param: book
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:19
    */
    int updateById(Book book);   //ok

    /**
     * 根据bookId查询图书信息
        * @Param: bookId
        * @return: com.ac.entity.Book
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:19
    */
    Book selectById(int bookId);  //ok

    /**
     * 根据信息模糊查询图书信息
        * @Param: book
        * @return: java.util.List<com.ac.entity.Book>
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:20
    */
    List<Book> selectByExample(Book book);

    /**
     * 逻辑删除
        * @Param: book
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:20
    */
    int updateDeleteFlag(Book book);  //ok

    /**
     * 借阅
        * @Param: userId  , bookId
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:21
    */
    int updateQuantity(int userId,int bookId);  //ok

    /**
     * 归还
        * @Param: userId  , bookId
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:21
    */
    int updateQuantityReturn(int userId,int bookId); //ok

    /**
     * 查询最大的bookId
        * @Param:
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:21
    */
    int selectMaxId();  //ok

    /**
     * 查询最小的bookid
        * @Param:
        * @return: int
        * @Author: zhanzheng.pang
        * @Date: 2021/10/21 14:21
    */
    int selectMinId();  //ok
}
