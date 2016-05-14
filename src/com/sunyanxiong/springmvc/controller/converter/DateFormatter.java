package com.sunyanxiong.springmvc.controller.converter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/14 0014.
 */
public class DateFormatter implements Formatter<Date> {

    private SimpleDateFormat simpleDateFormat;

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        return simpleDateFormat.format(date);
    }
}
