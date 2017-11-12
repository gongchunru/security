package com.gchr.service.impl;

import com.gchr.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by gongchunru
 * Date：2017/11/12.
 * Time：10:29
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String greeting(String name) {
        System.out.println("greeting");
        return "hello "+name;
    }
}
