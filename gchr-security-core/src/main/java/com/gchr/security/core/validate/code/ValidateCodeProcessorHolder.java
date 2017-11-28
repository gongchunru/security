package com.gchr.security.core.validate.code;

import org.hibernate.validator.internal.xml.ValidatedByType;
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

    @Autowired
    private Map<String, ValidateCodeProcessor> validateCodeProcessors;

    public ValidateCodeProcessor findValidateCodeProcessor(ValidateCodeType type){
        return findValidateCodeProcessor(type.toString().toLowerCase());
    }


    public ValidateCodeProcessor findValidateCodeProcessor(String type){
        String name = type.toLowerCase() + ValidateCodeProcessor.class.getSimpleName();
        ValidateCodeProcessor processor = validateCodeProcessors.get(name);
        if (processor == null) {
            throw new ValidateCodeException("验证码处理器"+name+"不存在");
        }
        return processor;
    }


}
