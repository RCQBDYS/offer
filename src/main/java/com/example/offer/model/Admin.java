package com.example.offer.model;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer adminid;

    private String admimname;

    private String adminpassword;

    private static final long serialVersionUID = 1L;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdmimname() {
        return admimname;
    }

    public void setAdmimname(String admimname) {
        this.admimname = admimname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminid=").append(adminid);
        sb.append(", admimname=").append(admimname);
        sb.append(", adminpassword=").append(adminpassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}