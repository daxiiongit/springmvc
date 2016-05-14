package com.sunyanxiong.springmvc.service.impl;

import com.sunyanxiong.springmvc.po.Book;
import com.sunyanxiong.springmvc.po.Category;
import com.sunyanxiong.springmvc.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */

@Service
public class BookServiceImpl implements BookService {

    private List<Category> categories;
    private List<Book> books;

    public BookServiceImpl() {
        // 构造图书分类
        categories = new ArrayList<Category>();
        Category category1 = new Category(1,"网络");
        Category category2 = new Category(2,"会计");
        Category category3 = new Category(3,"小说");
        Category category4 = new Category(4,"名著");
        Category category5 = new Category(5,"专业");
        Category category6 = new Category(6,"做人");
        // 添加到图书分类集合中
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);
        categories.add(category6);

        // 构造图书
        books = new ArrayList<Book>();
        books.add(new Book(1,"232532","计算机网络设计","孙艳雄",category1));
        books.add(new Book(2,"568236","会计学","孙艳雄",category2));
        books.add(new Book(3,"585465","爱情是这样的","孙艳雄",category3));

    }

    @Override
    public List<Category> getAllCategories() throws Exception {
        return categories;
    }

    @Override
    public Category getCategory(int id) throws Exception {
        for (Category category : categories){
            if (id == category.getId()){
                return category;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() throws Exception {
        return books;
    }

    @Override
    public Book saveBook(Book book) throws Exception {
        book.setId(getNextId());
        books.add(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) throws Exception {
        int bookCount = books.size();
        for (int i = 0;i < bookCount;i++){
            Book saveBook = books.get(i);
            if (saveBook.getId() == book.getId()){
                books.set(i,book);
                return book;
            }
        }
        return book;
    }

    @Override
    public Book get(int id) throws Exception {
        for (Book book : books){
            if(id == book.getId()) {
                return book;
            }
        }
        return null;
    }

    @Override
    public int getNextId() throws Exception {
        int id = 0;
        for (Book book : books){
            int bookId = book.getId();
            if (bookId > id){
                id = bookId;
            }
        }
        return id + 1;
    }
}
