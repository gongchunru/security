package com.gchr.security.core.authentication;

import com.gchr.security.core.properties.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @author gongchunru
 * @Package com.gchr.security.core.authentication
 * @date 2017/11/28 23:26
 *
 * 处理成功失败的处理器
 *
 */
public class AbstractChannelSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    protected AuthenticationSuccessHandler gchrAuthenticationSuccessHandler;

    @Autowired
    protected AuthenticationFailureHandler gchrAuthenticationFailureHandler;


    protected void applyPasswordAuthenticationConfig(HttpSecurity http)  throws Exception{
        http.formLogin()
                .loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
                .loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM)
                .successHandler(gchrAuthenticationSuccessHandler)
                .failureHandler(gchrAuthenticationFailureHandler);
    }


}
