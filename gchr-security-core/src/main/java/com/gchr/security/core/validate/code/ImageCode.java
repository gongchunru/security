package com.gchr.security.core.validate.code;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * @author gongchunru
 * Date：2017/11/17.
 * Time：17:48
 */
public class ImageCode extends ValidateCode {

    private BufferedImage image;

    public ImageCode(BufferedImage image, String code, int expireIn) {
        super(code,expireIn);
        this.image = image;
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
        super(code,expireTime);
        this.image = image;
    }


    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

}
