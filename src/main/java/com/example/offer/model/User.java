package com.example.offer.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class User implements Serializable {

    @NotEmpty(message="密码不能为空")
    @Length(min=3, message="密码长度不能少于3位")
    private String userName;

    private String userType;

    private String userPassword;

    private int userId;

    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType){
        this.userType = userType;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}