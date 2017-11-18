package com.gchr.web;

import com.google.common.base.CharMatcher;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author gongchunru
 * Date：2017/11/15.
 * Time：9:56
 */
public class Test {

    public static void main(String[] args) {
        String s = "a你bc%";
        String s2 = "";
        try {

//            System.out.println(URLDecoder.decode(s,"UTF-8"));

            s2  = URLEncoder.encode(s,"UTF-8");
            System.out.println(s2);
            s2 = URLDecoder.decode(s2,"UTF-8");
            System.out.println(s2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("1");
        System.out.println(s2);
        System.out.println("3");

//        char a = '】';

//        String b1 = "c";
//        String b2 = "】";
//        char[] a = {'1','b','】'};
//        System.out.println(b1.getBytes().length);
//        System.out.println(b2.getBytes().length);
//        System.out.println(a[2]);
    }
}
