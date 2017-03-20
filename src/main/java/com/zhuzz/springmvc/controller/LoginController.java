package com.zhuzz.springmvc.controller;

import com.zhuzz.springmvc.bean.User;
import com.zhuzz.springmvc.services.read.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/**
 * Created by h3ilang on 2017/3/8.
 */
@Controller
@RequestMapping("/v1/")
public class LoginController extends BaseController {

    @Autowired
    private UserSearchService userSearchService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> login(String username, String password) throws UnsupportedEncodingException {
        User user = userSearchService.getUser(username);
        if (user!= null) {
            return new ResponseEntity<String>("登录成功！", HttpStatus.OK);
        }
        return new ResponseEntity<String>("登录失败！",HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public ModelAndView page() {
        return new ModelAndView("login");
    }
}
