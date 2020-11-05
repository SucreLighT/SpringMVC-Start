package cn.sucrelt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sucre
 * 请求参数绑定实例的控制器类
 */

@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定
     *
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username) {
        System.out.println("执行了...");
        System.out.println("用户名：" + username);
        return "success";
    }
}
