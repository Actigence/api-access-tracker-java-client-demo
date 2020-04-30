package com.actigence.apiaccessloggerdemo;

import com.actigence.aal.ApiAccessLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration
{

    @Bean
    public FilterRegistrationBean<ApiAccessLoggingFilter> loggingFilter()
    {
        FilterRegistrationBean<ApiAccessLoggingFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new ApiAccessLoggingFilter());
        registrationBean.addUrlPatterns("/test/*");
        return registrationBean;
    }
}
