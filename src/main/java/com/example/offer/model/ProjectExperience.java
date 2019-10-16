package com.example.offer.model;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

public class ProjectExperience implements Serializable {
    private Integer projectid;

    private Integer userid;

    @NotEmpty(message="项目名称不能为空")
    private String projectname;

    private String projectrole;

    @NotEmpty(message="项目开始日期不能为空")
    private String projectstartdate;

    @NotEmpty(message="项目结束日期不能为空")
    private String projectenddate;

    private String projectcontent;

    private  String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public String getProjectstartdate() {
        return projectstartdate;
    }

    public void setProjectstartdate(String projectstartdate) {
        this.projectstartdate = projectstartdate;
    }

    public String getProjectenddate() {
        return projectenddate;
    }

    public void setProjectenddate(String projectenddate) {
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
        sb.append(", username=").append(username);
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