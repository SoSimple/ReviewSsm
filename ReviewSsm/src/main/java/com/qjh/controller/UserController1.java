package com.qjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2021/1/4 19:34
 * @version:
 * @modified By:
 */

@RequestMapping("/get")
@ResponseBody
@Controller
public class UserController1 {

    @RequestMapping("/test")
    public String getUser(){
        return "this is a  test";
    }

    @RequestMapping("/test1")
    public String getUser1(){

        return "/test.jsp";
    }

}
