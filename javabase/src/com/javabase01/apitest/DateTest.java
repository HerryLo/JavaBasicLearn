package com.javabase01.apitest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println(new Date().getTime());

        Date d = new Date();
        SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sf.format(d));

        // 通过SimpleDateFormat对象parse解析方法，将字符串转换成Date对象
        String str = "2022-02-11";
        SimpleDateFormat sf1= new SimpleDateFormat("yyyy-MM-dd");
        Date strDate = sf1.parse(str);
//        System.out.println(strDate);

        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH,1);
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.MONTH));
//        System.out.println(c.get(Calendar.DATE));

        Set<String> zi = ZoneId.getAvailableZoneIds();
//        System.out.println(zi);

        ZoneId zi1 = ZoneId.systemDefault();// 默认时区
//        System.out.println(zi1);

        Instant is = Instant.now();// 不区分时区
        System.out.println(is);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm");
        ZonedDateTime zdt = ZonedDateTime.now();// 区分时区
        System.out.println(df.format(zdt));

        ZonedDateTime zdt1 = Instant.now().atZone(ZoneId.of("Africa/Nairobi"));
        System.out.println(df.format(zdt1));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(df));
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.withHour(10));
    }
}
