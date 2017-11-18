package com.gchr.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author gongchunru
 * Date：2017/11/16.
 * Time：18:06
 */
@ConfigurationProperties(prefix = "gchr.security")
public class SecurityProperties {
    private BrowserProperties browser = new BrowserProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
