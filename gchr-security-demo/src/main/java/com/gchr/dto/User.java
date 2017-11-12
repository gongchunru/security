package com.gchr.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.gchr.validator.MyConstraint;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by gongchunru
 * Date：2017/11/11.
 * Time：21:32
 */
public class User {

    public interface UserSimpleView{};
    public interface UserDetailView extends UserSimpleView{}


    private String id;

    @MyConstraint(message = "这是一个测试")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    @Past(message = "生日必须是过去的时间")
    private Date birthday;

    public String getId() {
        return id;
    }

    @JsonView(UserSimpleView.class)
    public void setId(String id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
