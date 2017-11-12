package com.gchr.exception;

/**
 * Created by gongchunru
 * Date：2017/11/12.
 * Time：17:01
 */
public class UserNotExistException extends RuntimeException {

    private static final long serialVersionUID = -6112780192479692859L;

    private String id;

    public UserNotExistException(String id) {
        super("user not exist");
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
