package cn.qqcn.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier(value = "loginInterceptor")
    private HandlerInterceptor handlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(handlerInterceptor);
        //拦截请求
        registration.addPathPatterns("/**");
        //放行请求
        registration.excludePathPatterns(
                "/login",      //跳转页面
                "/captcha",    //验证码
                "/user/login", //登录
                "/user/logout",//注销
                "/layui/**",  //一些静态资源
                "/lib/**",
                "/webjars/**",
                "/api/**",
                "/css/**",
                "/js/**",
                "/images/**"
        );
    }
}
