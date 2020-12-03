package cn.sucrelt.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sucre
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    /**
     * 预处理方法，在controller方法执行前执行
     * 返回值为true表示放行，将会进入下一个拦截器或执行controller方法，false表示不放行
     * @author sucre
     * @function preHandle
     * @param [request, response, handler]
     * @return boolean
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器执行了...");
        return true;
    }

}
