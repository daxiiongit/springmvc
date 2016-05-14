package com.sunyanxiong.springmvc.service;

import com.sunyanxiong.springmvc.po.Book;
import com.sunyanxiong.springmvc.po.Category;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */
public interface BookService {

    // 获取所有图书分类信息
    List<Category> getAllCategories() throws Exception;

    // 根据id拿到分类对象
    Category getCategory(int id) throws Exception;

    // 获取所有的图书信息
    List<Book> getAllBooks() throws Exception;

    // 保存图书
    Book saveBook(Book book) throws Exception;

    // 更新图书
    Book updateBook(Book book) throws Exception;

    // 根据id获取图书信息
    Book get(int id) throws Exception;

    // 获取下一个id
    int getNextId() throws Exception;

}
