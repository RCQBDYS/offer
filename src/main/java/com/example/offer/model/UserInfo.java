package com.example.offer.model;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer userid;

    private String userrealname;

    private String username;

    private String usericon;

    private String userphone;

    private String userage;

    private String useraddresscity;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsericon() {
        return usericon;
    }

    public void setUsericon(String usericon) {
        this.usericon = usericon;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public String getUseraddresscity() {
        return useraddresscity;
    }

    public void setUseraddresscity(String useraddresscity) {
        this.useraddresscity = useraddresscity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", userrealname=").append(userrealname);
        sb.append(", username=").append(username);
        sb.append(", usericon=").append(usericon);
        sb.append(", userphone=").append(userphone);
        sb.append(", userage=").append(userage);
        sb.append(", useraddresscity=").append(useraddresscity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}