package com.zhuzz.springmvc.controller;

import com.zhuzz.springmvc.bean.User;
import com.zhuzz.springmvc.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;

/**
 * Created by h3ilang on 2017/3/8.
 */
@Controller
@RequestMapping("/v1/")
public class LoginController extends BaseController {

    @Autowired
    private UserSearchService userSearchService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView login(String username, String password) throws UnsupportedEncodingException {
        ModelAndView modelAndView = new ModelAndView();
        User user = userSearchService.getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            modelAndView.addObject("nickname",user.getNickname());
            modelAndView.setViewName("main");
        } else {
            modelAndView.setViewName("login");
            modelAndView.addObject("loginErrMsg","密码错误，密码是"+ user.getPassword());
        }
        return modelAndView;
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public ModelAndView page() {
        return new ModelAndView("login");
    }
    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public ModelAndView logout(){
        return new ModelAndView("login");
    }
}
