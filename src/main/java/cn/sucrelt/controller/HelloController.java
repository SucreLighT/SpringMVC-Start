package cn.sucrelt.controller;

import cn.sucrelt.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sucre
 * 控制器类
 */

@Controller
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello() throws SysException {
        System.out.println("hello springMVC");

        // 模拟发生异常
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            // 打印异常信息
            e.printStackTrace();
            // 抛出自定义异常信息
            throw new SysException("模拟异常：查询所有用户出现错误了...");
        }

        return "success";
    }
}
