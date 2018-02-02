package com.lzh.testDemo.restful;

import com.lzh.testDemo.domain.Book;
import com.lzh.testDemo.mapper.BookMapper;
import com.lzh.testDemo.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Date: 2018-02-01-10:58
 * Created By lzh.
 */
@RestController
@RequestMapping("/api/v1")
public class BookRestful {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookServiceImpl bookService;

    /**
     * 返回book列表
     *
     * @return List<Book>
     */
    @GetMapping("/books")
    public List<Book> bookList(){
        return bookMapper.selectBookList();
    }

    /**
     * 返回所有书借出次数
     * @return bookCount
     */
    @GetMapping("/books/count")
    public Object bookCount(){
        Map<String,Object> bookMap = new HashMap<>();
        bookMap.put("bookCount",bookService.lendTheNumber());
        return bookMap;
    }
}

