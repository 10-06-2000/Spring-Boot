package com.example.interviewFeedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Interviewfeedback {
    public Interviewfeedback(Long id, String userid, String candidateName, String position, String interviewerName, String interviewerEmpid, int rating, String status) {
        this.id = id;
        Userid = userid;
        CandidateName = candidateName;
        this.position = position;
        InterviewerName = interviewerName;
        InterviewerEmpid = interviewerEmpid;
        this.rating = rating;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String Userid;
    private String CandidateName;
    private String position;
    private String InterviewerName;
    private String InterviewerEmpid;
    private int rating;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

    public String getCandidateName() {
        return CandidateName;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInterviewerName() {
        return InterviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        InterviewerName = interviewerName;
    }

    public String getInterviewerEmpid() {
        return InterviewerEmpid;
    }

    public void setInterviewerEmpid(String interviewerEmpid) {
        InterviewerEmpid = interviewerEmpid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
