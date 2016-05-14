package com.sunyanxiong.springmvc.service.impl;

import com.sunyanxiong.springmvc.po.User;
import com.sunyanxiong.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */

@Service
public class UserServiceImpl implements UserService {

    private Map<Long,User> usermap = new HashMap<Long,User>();

    // 创建一个自动自增的工具
    private AtomicLong generator = new AtomicLong();

    // 添加一个构造方法
    public UserServiceImpl() throws Exception{
        User user = new User();
        user.setUsername("孙艳雄");
        user.setPassword("sunyanxiong");

        // 调用添加方法
        insertUser(user);
    }

    @Override
    public User insertUser(User user) throws Exception {
        long id = generator.incrementAndGet();
        user.setId(id);
        usermap.put(id,user);
        return user;
    }

    @Override
    public User queryUser(long id) throws Exception {
        return usermap.get(id);
    }
}
