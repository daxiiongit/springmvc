package com.sunyanxiong.springmvc.controller;

import com.sunyanxiong.springmvc.po.testConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */

@Controller
public class ConverterDateController {

    @RequestMapping("/input_testConverter")
    public String inputConverter(Model model) throws Exception{
        model.addAttribute(new testConverter());
        return "testConverterForm";
    }

    @RequestMapping("/save_testConverter")
    public String saveConverter(testConverter testConverter,Model model) throws Exception{

        model.addAttribute("testConverter",testConverter);

        System.out.println("时间为:" + testConverter.getCreatetime());
        return "converter_success";
    }
}
