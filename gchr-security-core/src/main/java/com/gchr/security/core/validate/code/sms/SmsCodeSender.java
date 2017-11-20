package com.gchr.security.core.validate.code.sms;

/**
 * @author gongchunru
 * Date：2017/11/18.
 * Time：23:52
 */
public interface SmsCodeSender {
    void send(String mobile, String code);
}
