package com.example.offer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class PostMessage implements Serializable {
    private Integer postId;

    private String postName;

    private String postSkill;

    private Integer postNum;

    private Double postSalary;

    private Integer postSuccNum;

    private String postIntroduce;

    private String postRequire;

    private String postAddress;

    private Integer userId;

    private Integer enterId;

    private Integer postState;

    private User user;

    private EnterpriseMessage enterprise;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostSkill() {
        return postSkill;
    }

    public void setPostSkill(String postSkill) {
        this.postSkill = postSkill;
    }

    public Integer getPostNum() {
        return postNum;
    }

    public void setPostNum(Integer postNum) {
        this.postNum = postNum;
    }

    public Double getPostSalary() {
        return postSalary;
    }

    public void setPostSalary(Double postSalary) {
        this.postSalary = postSalary;
    }

    public Integer getPostSuccNum() {
        return postSuccNum;
    }

    public void setPostSuccNum(Integer postSuccNum) {
        this.postSuccNum = postSuccNum;
    }

    public String getPostIntroduce() {
        return postIntroduce;
    }

    public void setPostIntroduce(String postIntroduce) {
        this.postIntroduce = postIntroduce;
    }

    public String getPostRequire() {
        return postRequire;
    }

    public void setPostRequire(String postRequire) {
        this.postRequire = postRequire;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEnterId() {
        return enterId;
    }

    public void setEnterId(Integer enterId) {
        this.enterId = enterId;
    }

    public Integer getPostState() {
        return postState;
    }

    public void setPostState(Integer postState) {
        this.postState = postState;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EnterpriseMessage getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseMessage enterprise) {
        this.enterprise = enterprise;
    }
}