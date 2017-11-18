package com.gchr.security.browser.support;

/**
 * @author gongchunru
 * Date：2017/11/16.
 * Time：18:01
 */
public class SimpleResponse {
    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public SimpleResponse(Object content) {
        this.content = content;
    }
}
