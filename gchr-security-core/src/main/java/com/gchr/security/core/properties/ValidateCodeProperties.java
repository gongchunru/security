package com.gchr.security.core.properties;

import com.gchr.security.core.validate.code.ImageCode;

/**
 * @author gongchunru
 * Date：2017/11/18.
 * Time：8:45
 */
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();

    public ImageCodeProperties getImage() {
        return image;
    }

    public void setImage(ImageCodeProperties image) {
        this.image = image;
    }
}
