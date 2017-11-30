package com.gchr.security.core.validate.code;

import com.gchr.security.core.properties.SecurityProperties;
import com.gchr.security.core.validate.code.image.ImageCodeGenerator;
import com.gchr.security.core.validate.code.sms.DefaultSmsCodeSender;
import com.gchr.security.core.validate.code.sms.SmsCodeSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gongchunru
 * Date：2017/11/18.
 * Time：8:32
 */
@Configuration
public class ValidateCodeBeanConfig {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SecurityProperties securityProperties;

    @Bean
    @ConditionalOnMissingBean(name = "imageValidateCodeGenerator")
    public ValidateCodeGenerator imageCodeGenerator(){
        logger.info("进入默认的图片验证码生成器 方法 imageCodeGenerator :");
        ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
        codeGenerator.setSecurityProperties(securityProperties);
        return codeGenerator;
    }

    @Bean
    @ConditionalOnMissingBean(SmsCodeSender.class)
    public SmsCodeSender smsCodeSender(){
        logger.info("默认的短信验证码生成器 ");
        return new DefaultSmsCodeSender();
    }


}
