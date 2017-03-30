package com.zhuzz.springmvc.services.impl;

import com.zhuzz.springmvc.bean.User;
import com.zhuzz.springmvc.services.UserSearchService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by h3ilang on 2017/3/8.
 */
@Service
public class UserSearchServiceImpl implements UserSearchService {

    public User getUser(String username) {
        if (StringUtils.isEmpty(username)){
            return null;
        }
        User user = new User();
        user.setUsername(username);
        user.setNickname("黑狼");
        user.setPassword("123456");
        user.setUid(1L);
        return user;
    }
}
