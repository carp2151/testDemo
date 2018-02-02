package com.lzh.testDemo.service.impl;

import com.lzh.testDemo.domain.Book;
import com.lzh.testDemo.mapper.BookMapper;
import com.lzh.testDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Date: 2018-02-01-10:41
 * Created By lzh.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper mapper;

    /**
     * 图书借出总次数
     * @return count
     */
    @Override
    public Integer lendTheNumber() {
        int count = 0;
        List<Book> bookList = mapper.selectBookList();
        for (Book book:bookList) {
            count = count + book.getCount();
        }
        return count;
    }
}
