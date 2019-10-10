package com.cxq.springboot.web; /**
 * @Author: cxq
 * @Date: 2019/10/9 16:20
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: cxq
 * @Date: 2019/10/9 16:20
 */
@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world!");
        return "hello/hello";
    }
}
