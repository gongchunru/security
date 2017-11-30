package com.gchr.security.core.validate.code.image;

import com.gchr.security.core.validate.code.impl.AbstractValidateCodeProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;

/**
 * @author gongchunru
 * Date：2017/11/28.
 * Time：12:41
 * 图形验证码处理器
 */
@Component("imageValidateCodeProcessor")
public class ImageCodeProcessor extends AbstractValidateCodeProcessor<ImageCode>{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    protected void send(ServletWebRequest request, ImageCode imageCode) throws Exception {
        logger.info("开始发送验证码");
        ImageIO.write(imageCode.getImage(), "JPEG", request.getResponse().getOutputStream());
    }
}
