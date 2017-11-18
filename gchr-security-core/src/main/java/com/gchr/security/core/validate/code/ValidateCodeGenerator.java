package com.gchr.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author gongchunru
 * Date：2017/11/18.
 * Time：8:37
 */
public interface ValidateCodeGenerator  {
    ImageCode generate(ServletWebRequest request);
}
