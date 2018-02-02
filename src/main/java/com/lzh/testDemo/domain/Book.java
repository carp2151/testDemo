package com.lzh.testDemo.domain;

import lombok.Data;
import java.util.Date;

/**
 * Date: 2018-01-31-20:03
 * Created By lzh.
 */
@Data
public class Book {

    /**
     * 图书id
     */
    private String bookId;
    /**
     * 图书名称
     */
    private String bookName;
    /**
     * 图书作者
     */
    private String bookAuthor;
    /**
     * 图书介绍
     */
    private String bookInfo;
    /**
     * 图书状态
     */
    private Integer status;
    /**
     * 借出次数
     */
    private Integer count;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 有参的构造方法
     *
     * @param bookId 图书id
     * @param bookName 图书名称
     * @param bookAuthor 图书作者
     * @param bookInfo 图书介绍
     */
    public Book(String bookId, String bookName, String bookAuthor, String bookInfo) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookInfo = bookInfo;
    }

    /**
     * 无参的构造方法
     */
    public Book() {
    }
}

