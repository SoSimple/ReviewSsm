package com.qjh.controller;

import com.qjh.entity.User;
import com.qjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(String userName,String password, HttpSession session){
        System.out.println(userName.toString()+"从前台获取的数据"+password);
        /*String userName = user.getUserName();*/
        User user1 = userService.checkUser(userName);
        if(user1!=null){
            System.out.println(user1.toString());
            System.out.println(password+" "+user1.getPassword());
            if(password.equals(user1.getPassword())){
                session.setAttribute("user",user1);
                return "redirect:/get/test";
            }
            return "fail";
        }else{
            return "不存在此用户";
        }
    }
    @RequestMapping("/testJump")
    public String testJump(){
       // return "redirect:/get/test";
        return "fail";
    }

    @RequestMapping("/login1")
    public String login(){
        // return "redirect:/get/test";
        return "login";
    }


}
