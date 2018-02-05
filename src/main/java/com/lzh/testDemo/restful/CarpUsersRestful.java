package com.lzh.testDemo.restful;

import com.lzh.testDemo.domain.CarpUsers;
import com.lzh.testDemo.mapper.CarpUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class CarpUsersRestful {

    @Autowired
    private CarpUsersMapper usersMapper;

    /**
     * 获取一条同学信息
     * @param number 工号
     * @return user
     */
    @GetMapping("/user/{number}")
    public Object saveUser(@PathVariable String number){
        return usersMapper.selectUserByNumber(number);
    }

    /**
     * 插入一条同学信息
     * @param carpUsers user
     * @return 1,0
     */
    @PostMapping("/user")
    public Object insertOne(CarpUsers carpUsers){
        Map<String,Object> message = new HashMap<>();
        message.put("method","insert");
        message.put("code",usersMapper.insertUser(carpUsers));
        return message;
    }

    @PostMapping("/user/update")
    public Object updateOne(CarpUsers carpUsers){
        Map<String,Object> message = new HashMap<>();
        message.put("method","update");
        message.put("code",usersMapper.updateUser(carpUsers));
        return message;
    }



}
