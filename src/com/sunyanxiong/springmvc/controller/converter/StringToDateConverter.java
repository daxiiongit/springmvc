package com.sunyanxiong.springmvc.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: 将字符串转化为日期格式
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */
public class StringToDateConverter implements Converter<String,Date>{

    @Override
    public Date convert(String s) {

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            // 是否严格解析日期
            simpleDateFormat.setLenient(false);
            // 转换成功直接返回
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 如果参数绑定失败返回null
        return null;
    }
}
