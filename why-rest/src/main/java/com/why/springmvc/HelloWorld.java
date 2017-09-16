package com.why.springmvc;

import com.why.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author wanghanyu
 * @create 2017-09-16 14:03
 */
@Controller
@RequestMapping("/hello/")
public class HelloWorld {

    @Resource
    private HelloService helloService;

    @ResponseBody
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        return helloService.sayHello();
    }
}
