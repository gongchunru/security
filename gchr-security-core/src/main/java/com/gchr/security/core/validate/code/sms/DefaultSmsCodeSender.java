package com.gchr.security.core.validate.code.sms;

/**
 * @author gongchunru
 * Date：2017/11/18.
 * Time：23:54
 */
public class DefaultSmsCodeSender implements SmsCodeSender{
    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机: "+mobile+" 发送短信验证码:"+code);
    }
}
