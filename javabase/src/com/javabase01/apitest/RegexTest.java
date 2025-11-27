package com.javabase01.apitest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        // 手机号正则表达式：13995567034 13582921234 18523451256
        String regex = "1[3-9][0-9]{9}";// 表示第一位只能是1，第二位是3-9，剩余的九位数字从0-9都可以
        System.out.println("13005567091".matches(regex));

        // 座机号正则：025-4323545 0721-4323545 0352323545
        String regex1 = "0[0-9]{2,3}-?[1-9]\\d{4,9}";
        System.out.println("025-4323545".matches(regex));

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
//Pattern :表示正则表达式
        Pattern p = Pattern.compile("Java");
//Matcher ：文本匹配器
        Matcher m = p.matcher(str);

        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
