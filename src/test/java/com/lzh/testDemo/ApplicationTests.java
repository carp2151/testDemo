package com.lzh.testDemo;


import com.lzh.testDemo.domain.CarpUsers;
import com.lzh.testDemo.mapper.BookMapper;
import com.lzh.testDemo.mapper.CarpUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


@SpringBootTest
public class ApplicationTests extends AbstractTestNGSpringContextTests {

    @Autowired
    private BookMapper mapper;

    @Autowired
    private CarpUsersMapper usersMapper;

    @Test
    public void  testCase001(){
        System.out.println(mapper.selectBookById("A0001").toString());
    }

    @Test
    public void testCase002(){
        System.out.println(usersMapper.selectUserByNumber("A1234").toString());
    }

    @Test
    public void testCase003(){
        CarpUsers carpUsers = new CarpUsers("A2345","李正华","002组","120");
        System.out.println(usersMapper.insertUser(carpUsers));
    }

}
