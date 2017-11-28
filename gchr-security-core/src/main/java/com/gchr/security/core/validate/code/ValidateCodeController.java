package com.gchr.security.core.validate.code;

import com.gchr.security.core.properties.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gongchunru
 * Date：2017/11/17.
 * Time：17:51
 * 1. 根据随机数生成图片
 * 2. 将随机数存到session中
 * 3. 在将生成的图片写到接口的响应中
 *
 */
@RestController
public class ValidateCodeController {
    @Autowired
    private ValidateCodeProcessorHolder validateCodeProcessorHolder;

    @GetMapping(SecurityConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX + "/{type}")
    public void createCode(HttpServletRequest request, HttpServletResponse response, @PathVariable String type) throws Exception{
        validateCodeProcessorHolder.findValidateCodeProcessor(type).create(new ServletWebRequest(request,response));
    }

}
