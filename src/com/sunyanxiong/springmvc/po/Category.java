package com.sunyanxiong.springmvc.po;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */
public class Category {

    private int id;
    private String name;

    public Category() {
    }

    public Category(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
