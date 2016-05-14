package com.sunyanxiong.springmvc.po;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */
public class User {

    private long id;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
