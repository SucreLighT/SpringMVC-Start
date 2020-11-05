package cn.sucrelt.controller;

import cn.sucrelt.domain.Account;
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
     * 请求参数的绑定-基本数据类型
     *
     * @param username
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username) {
        System.out.println("执行了...");
        System.out.println("用户名：" + username);
        return "success";
    }

    /**
     * 请求参数的绑定-JavaBean类型
     *
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }

    /**
     * 请求参数的绑定-包含引用类型的JavaBean类型
     *
     * @param account
     * @return
     */
    @RequestMapping("/saveUserAccount")
    public String saveUserAccount(Account account) {
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }
}
