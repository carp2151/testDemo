package com.lzh.testDemo;


import com.lzh.testDemo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


@SpringBootTest
public class ApplicationTests extends AbstractTestNGSpringContextTests {

    @Autowired
    private BookMapper mapper;

    @Test
    public void  testCase001(){
        System.out.println(mapper.selectBookById("A0001").toString());
    }

}
