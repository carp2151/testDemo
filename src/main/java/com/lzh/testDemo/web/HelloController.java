package com.lzh.testDemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        List<String> stringList = new ArrayList<>();
        stringList.add("li");
        stringList.add("zheng");
        stringList.add("hua");
        model.addAttribute("name","lizhenghua");
        model.addAttribute("list",stringList);

        return "index";
    }
}
