package com.qjh.controller;

import com.qjh.entity.User;
import com.qjh.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/29 22:42
 * @version:
 * @modified By:
 */
@Controller
@RequestMapping
public class UserController {

    private UserServiceImpl userService;
    @RequestMapping("/getUser")
    private ModelAndView getUser(){
        ModelAndView mav =new ModelAndView();
        User user = userService.getUser(1);
        mav.addObject("user",user);
        return mav;
    }


}
