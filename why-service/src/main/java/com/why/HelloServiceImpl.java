package com.why;

import org.springframework.stereotype.Service;

/**
 * @author wanghanyu
 * @create 2017-09-16 13:10
 */

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello Hanyu";
    }
}
