package com.lzh.testDemo.mapper;

import com.lzh.testDemo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {

    /**
     * 根据id获取一条图书信息
     *
     * @param bookId 图书id
     * @return Book
     */
    Book selectBookById(@Param("bookId") String bookId);

    /**
     * 保存一条图书信息
     *
     * @param book Book
     * @return 0:保存失败,1:保存成功
     */
    Integer saveBook(Book book);

    /**
     * 根据id去更新图书名称
     *
     * @param bookId 图书id
     * @param bookName 图书name
     * @return Book
     */
    Integer updateBookNameById(@Param("bookId") String bookId,@Param("bookName") String bookName);

    /**
     * 获取图书列表
     *
     * @return List<Book>
     */
    List<Book> selectBookList();
}

