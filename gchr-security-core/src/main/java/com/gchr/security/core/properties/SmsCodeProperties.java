package com.gchr.security.core.properties;

/**
 * @author gongchunru
 * Date：2017/11/19.
 * Time：0:18
 */
public class SmsCodeProperties {

    private int length = 6;
    private int expireIn = 60;

    private String url;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
