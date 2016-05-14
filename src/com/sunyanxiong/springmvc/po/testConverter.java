package com.sunyanxiong.springmvc.po;

import java.util.Date;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */
public class testConverter {

    private int id;
    private Date createtime;

    private Date birthday;
    private Date death;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return "testConverter{" +
                "id=" + id +
                ", createtime=" + createtime +
                ", birthday=" + birthday +
                ", death=" + death +
                '}';
    }
}
