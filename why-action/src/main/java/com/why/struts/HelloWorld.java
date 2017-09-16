package com.why.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author wanghanyu
 * @create 2017-09-16 11:18
 */
public class HelloWorld extends ActionSupport {
    public String sayHello() {
        System.out.println("Hello Hanyu King2");
        return SUCCESS;
    }
}
