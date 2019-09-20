package com.example.offer.model;

import java.io.Serializable;

public class PostMessage implements Serializable {
    private Integer postid;

    private String postname;

    private String postskill;

    private Integer postnum;

    private Double postsalary;

    private Integer postsuccnum;

    private String postintroduce;

    private String postrequire;

    private String postaddress;

    private static final long serialVersionUID = 1L;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public String getPostskill() {
        return postskill;
    }

    public void setPostskill(String postskill) {
        this.postskill = postskill;
    }

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    public Double getPostsalary() {
        return postsalary;
    }

    public void setPostsalary(Double postsalary) {
        this.postsalary = postsalary;
    }

    public Integer getPostsuccnum() {
        return postsuccnum;
    }

    public void setPostsuccnum(Integer postsuccnum) {
        this.postsuccnum = postsuccnum;
    }

    public String getPostintroduce() {
        return postintroduce;
    }

    public void setPostintroduce(String postintroduce) {
        this.postintroduce = postintroduce;
    }

    public String getPostrequire() {
        return postrequire;
    }

    public void setPostrequire(String postrequire) {
        this.postrequire = postrequire;
    }

    public String getPostaddress() {
        return postaddress;
    }

    public void setPostaddress(String postaddress) {
        this.postaddress = postaddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postid=").append(postid);
        sb.append(", postname=").append(postname);
        sb.append(", postskill=").append(postskill);
        sb.append(", postnum=").append(postnum);
        sb.append(", postsalary=").append(postsalary);
        sb.append(", postsuccnum=").append(postsuccnum);
        sb.append(", postintroduce=").append(postintroduce);
        sb.append(", postrequire=").append(postrequire);
        sb.append(", postaddress=").append(postaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}