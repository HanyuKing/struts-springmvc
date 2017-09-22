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

/**
 * require the grobal Request、Response easy
 *
 *
 
package com.why.springmvc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.RequestToViewNameTranslator;

public class RequestResponseContextHolder implements HandlerInterceptor {

	public static ThreadLocal<HttpServletRequest> requestTL = new ThreadLocal<>();
	
	public static ThreadLocal<HttpServletResponse> responseTL = new ThreadLocal<>();
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		System.out.println("set request: " + request);
		System.out.println("set response: " + response);
		requestTL.set(request);
		responseTL.set(response);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle request: " + request);
		System.out.println("postHandle response: " + response);
		System.out.println("postHandle get request: " + requestTL.get());
		System.out.println("postHandle get response: " + responseTL.get());
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
		System.out.println("afterCompletion get request: " + requestTL.get());
		System.out.println("afterCompletion get response: " + responseTL.get());
		requestTL.remove();
		responseTL.remove();
	}

	public static HttpServletRequest getRequest() {
		return requestTL.get();
	}
	
	public static HttpServletResponse getResponse() {
		return responseTL.get();
	}
}
*/
