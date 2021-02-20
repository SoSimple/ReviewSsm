package com.qjh.controller;

import com.qjh.entity.User;

import com.qjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/29 22:42
 * @version:
 * @modified By:
 */
@Controller
@RequestMapping
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/getUser")
    public User getUser(){
        ModelAndView mav =new ModelAndView();
        User user = userService.getUser(1);
        mav.addObject("user",user);
        return user;
    }
    @RequestMapping(value = "/getUsers")
    public ModelAndView getUsers(ModelAndView modelAndView){
        List<User> users = userService.getUsers();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("test");
        return modelAndView;
    }




}
