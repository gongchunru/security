package com.gchr.security.core.properties;

import sun.rmi.runtime.Log;

/**
 * @author gongchunru
 * Date：2017/11/16.
 * Time：18:06
 */
public class BrowserProperties {
    private String loginPage = "/signIn.html";

    private LoginType loginType = LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
