package com.gchr.security.core.properties;

/**
 * @author gongchunru
 * Date：2017/11/18.
 * Time：8:43
 */
public class ImageCodeProperties extends SmsCodeProperties {

    public  ImageCodeProperties(){
        setLength(4);
    }

    private int width = 67;
    private int height = 23;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
