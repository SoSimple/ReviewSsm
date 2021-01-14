package com.qjh.controller;

import com.qjh.entity.User;
import com.qjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2021/1/14 21:06
 * @version:
 * @modified By:
 */
@Controller
@RequestMapping
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(User user, HttpSession session){
        String userName = user.getUserName();
        User user1 = userService.checkUser(userName);
        if(user.getUserName()==user1.getUserName()&&user.getPassword()==user1.getPassword()){
            session.setAttribute("user",user1);
            return "redirect:/test";
        }
        return "/fail";
    }
}
