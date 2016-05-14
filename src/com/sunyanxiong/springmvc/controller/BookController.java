package com.sunyanxiong.springmvc.controller;

import com.sunyanxiong.springmvc.po.Book;
import com.sunyanxiong.springmvc.po.Category;
import com.sunyanxiong.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/list_book")
    public String listBooks(Model model)throws Exception{
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books",books);
        return "list_book";
    }

    // 请求处理到添加图书信息的表单
    @RequestMapping("/input_book")
    public String inputBooks(Model model)throws Exception{
        List<Category> categories = bookService.getAllCategories();
        model.addAttribute("categories",categories);
        model.addAttribute("book",new Book());
        return "input_book";
    }

    // 添加图书
    @RequestMapping("/save_book")
    public String saveBooks(@ModelAttribute Book book) throws Exception{
        Category category = bookService.getCategory(book.getCategory().getId());
        System.out.println(category);
        book.setCategory(category);
        bookService.saveBook(book);
        System.out.println(book);
        return "redirect:/list_book";
    }

    // 更新数据之前，需要将数据回显到修改表单
    @RequestMapping("/edit_book/{id}")
    public String editBooks(@PathVariable int id, Model model) throws Exception {
        List<Category> categories = bookService.getAllCategories();
        model.addAttribute("categories",categories);
        Book book = bookService.get(id);
        model.addAttribute("book",book);
        return "edit_book";
    }

    // 更新数据
    @RequestMapping("/update_book")
    public String updateBooks(@ModelAttribute Book book) throws Exception{
        Category category = bookService.getCategory(book.getCategory().getId());
        book.setCategory(category);
        bookService.updateBook(book);
        return "redirect:/list_book";
    }

}
