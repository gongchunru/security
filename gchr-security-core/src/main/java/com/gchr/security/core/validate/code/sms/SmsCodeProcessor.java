package com.gchr.security.core.validate.code.sms;

import com.gchr.security.core.properties.SecurityConstants;
import com.gchr.security.core.validate.code.ValidateCode;
import com.gchr.security.core.validate.code.impl.AbstractValidateCodeProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author gongchunru
 * Date：2017/11/28.
 * Time：12:35
 * 短信验证码处理器
 */
@Component("smsValidateCodeProcessor")
public class SmsCodeProcessor extends AbstractValidateCodeProcessor<ValidateCode>{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SmsCodeSender smsCodeSender;

    @Override
    protected void send(ServletWebRequest request, ValidateCode validateCode) throws Exception {

        logger.info("开始发送短信验证码:SmsCodeProcessor validateCode:{} ",validateCode);

        String paramName = SecurityConstants.DEFAULT_PARAMETER_NAME_MOBILE;
        String mobile = ServletRequestUtils.getRequiredStringParameter(request.getRequest(),paramName);
        smsCodeSender.send(mobile,validateCode.getCode());
    }
}
