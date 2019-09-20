package com.example.offer.model;

import java.io.Serializable;
import java.util.Date;

public class ProjectExperience implements Serializable {
    private Integer projectid;

    private Integer userid;

    private String projectname;

    private String projectrole;

    private Date projectstartdate;

    private Date projectenddate;

    private String projectcontent;

    private static final long serialVersionUID = 1L;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectrole() {
        return projectrole;
    }

    public void setProjectrole(String projectrole) {
        this.projectrole = projectrole;
    }

    public Date getProjectstartdate() {
        return projectstartdate;
    }

    public void setProjectstartdate(Date projectstartdate) {
        this.projectstartdate = projectstartdate;
    }

    public Date getProjectenddate() {
        return projectenddate;
    }

    public void setProjectenddate(Date projectenddate) {
        this.projectenddate = projectenddate;
    }

    public String getProjectcontent() {
        return projectcontent;
    }

    public void setProjectcontent(String projectcontent) {
        this.projectcontent = projectcontent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectid=").append(projectid);
        sb.append(", userid=").append(userid);
        sb.append(", projectname=").append(projectname);
        sb.append(", projectrole=").append(projectrole);
        sb.append(", projectstartdate=").append(projectstartdate);
        sb.append(", projectenddate=").append(projectenddate);
        sb.append(", projectcontent=").append(projectcontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}