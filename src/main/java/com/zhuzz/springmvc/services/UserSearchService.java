package com.zhuzz.springmvc.services;

import com.zhuzz.springmvc.bean.User;

/**
 * Created by h3ilang on 2017/3/8.
 */
public interface UserSearchService {

    User getUser(String username);
}
