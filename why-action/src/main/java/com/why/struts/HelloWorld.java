package com.why.struts;

import com.opensymphony.xwork2.ActionSupport;
import com.why.HelloService;

import javax.annotation.Resource;

/**
 * @author wanghanyu
 * @create 2017-09-16 11:18
 */
public class HelloWorld extends ActionSupport {

    @Resource
    private HelloService helloService;

    public String sayHello() {
        System.out.println(helloService.sayHello());
        return SUCCESS;
    }
}
