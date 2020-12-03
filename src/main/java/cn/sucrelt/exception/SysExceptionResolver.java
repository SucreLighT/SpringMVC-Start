package cn.sucrelt.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sucre
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        SysException e = null;
        // 获取到自定义的异常对象
        if (ex instanceof SysException) {
            e = (SysException) ex;
        } else {
            // 非自定义异常对象，提示出错
            e = new SysException("系统正在维护...");
        }

        // 创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        // 存入错误的提示信息
        mv.addObject("errorMsg", e.getMessage());
        // 跳转的Jsp页面
        mv.setViewName("error");
        return mv;
    }
}
