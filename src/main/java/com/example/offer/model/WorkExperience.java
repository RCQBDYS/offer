package com.example.offer.model;

import java.io.Serializable;
import java.util.Date;

public class WorkExperience implements Serializable {
    private Integer workid;

    private String workcompany;

    private String workjob;

    private String workstartdate;

    private String workenddate;

    private String workcontent;

    private Integer userid;

    private String username;

    private static final long serialVersionUID = 1L;

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public String getWorkcompany() {
        return workcompany;
    }

    public void setWorkcompany(String workcompany) {
        this.workcompany = workcompany;
    }

    public String getWorkjob() {
        return workjob;
    }

    public void setWorkjob(String workjob) {
        this.workjob = workjob;
    }

    public String getWorkstartdate() {
        return workstartdate;
    }

    public void setWorkstartdate(String workstartdate) {
        this.workstartdate = workstartdate;
    }

    public String getWorkenddate() {
        return workenddate;
    }

    public void setWorkenddate(String workenddate) {
        this.workenddate = workenddate;
    }

    public String getWorkcontent() {
        return workcontent;
    }

    public void setWorkcontent(String workcontent) {
        this.workcontent = workcontent;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workid=").append(workid);
        sb.append(", workcompany=").append(workcompany);
        sb.append(", workjob=").append(workjob);
        sb.append(", workstartdate=").append(workstartdate);
        sb.append(", workenddate=").append(workenddate);
        sb.append(", workcontent=").append(workcontent);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}