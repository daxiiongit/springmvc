package com.sunyanxiong.springmvc.controller;

import com.sunyanxiong.springmvc.po.User;
import com.sunyanxiong.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */

@Controller
/*@RequestMapping("/customer")*/
public class CustomerController {

    /*@RequestMapping(value = "/input_customer")
    public String inputCustomer(){

        return "input_success!";
    }

    // 表单提交处理请求
    @RequestMapping("/input_user")
    public String inputUser(){

        return "input_user";
    }

    // 返回页面
    @RequestMapping("/save_user")
    public String saveUser(User user, Model model){
        User userModel = new User();
        userModel.setUsername(user.getUsername());
        userModel.setPassword(user.getPassword());

        // 添加用户信息到 model
        model.addAttribute("userModel",userModel);

        // 返回到的 jsp 的页面的名字
        return "save_success";
    }
*/
    // 通过依赖注入的方式处理业务逻辑
    @Autowired
    private UserService userService;

    // 表单提交处理请求
    @RequestMapping("/input_user")
    public String inputUser(){

        return "input_user";
    }

    // 返回页面
    @RequestMapping("/save_user")
    public String saveUser(User user, RedirectAttributes redirectAttributes) throws Exception {
        User userModel = new User();
        userModel.setUsername(user.getUsername());
        userModel.setPassword(user.getPassword());

        User saveUser = userService.insertUser(userModel);

        // 重定向
        redirectAttributes.addFlashAttribute("message","用户信息成功添加");

        // 返回到的 jsp 的页面的名字
        return "redirect:/view_user/" + saveUser.getId();
    }

    // 显示用户信息
    @RequestMapping("/view_user/{id}")
    public String viewUser(@PathVariable long id,Model model) throws Exception {
        User user = userService.queryUser(id);
        model.addAttribute("user",user);
        return "view_user";
    }

    // 测试@ModelAttribute注解的到方法上
    @ModelAttribute("user")
    public void before(User user){

        user.setUsername("5555");
        user.setPassword("6666");

        System.out.println("用户名: " + user.getUsername() + "密码：" + user.getPassword());
    }

}
