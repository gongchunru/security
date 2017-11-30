package com.gchr.security.core.validate.code;

import org.hibernate.validator.internal.xml.ValidatedByType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author gongchunru
 * Date：2017/11/28.
 * Time：10:50
 */
@Component
public class ValidateCodeProcessorHolder {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private Map<String, ValidateCodeProcessor> validateCodeProcessors;

    public ValidateCodeProcessor findValidateCodeProcessor(ValidateCodeType type){
        return findValidateCodeProcessor(type.toString().toLowerCase());
    }


    public ValidateCodeProcessor findValidateCodeProcessor(String type){
        String name = type.toLowerCase() + ValidateCodeProcessor.class.getSimpleName();
        ValidateCodeProcessor processor = validateCodeProcessors.get(name);
        logger.info("获取验证码处理器 name:{}, processor:{}",name, processor);
        if (processor == null) {
            throw new ValidateCodeException("验证码处理器"+name+"不存在");
        }
        return processor;
    }


}
