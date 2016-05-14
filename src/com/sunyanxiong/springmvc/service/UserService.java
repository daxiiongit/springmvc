package com.sunyanxiong.springmvc.service;

import com.sunyanxiong.springmvc.po.User;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */
public interface UserService {
    // 添加用户信息
    User insertUser(User user) throws Exception;
    // 获取用户信息
    User queryUser(long id) throws Exception;
}
