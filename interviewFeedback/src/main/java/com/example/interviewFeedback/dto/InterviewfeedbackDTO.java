package com.example.interviewFeedback.dto;

public class InterviewfeedbackDTO  {
    private Long id;
    private String Userid;
    private String CandidateName;
    private String position;
    private String InterviewerName;
    private String InterviewerEmpid;
    private int rating;
    private String status;

    public InterviewfeedbackDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getUserid() {
        return this.Userid;
    }

    public void setCandidateName(String CandidateName) {
        this.CandidateName = CandidateName;
    }

    public String getCandidateName() {
        return this.CandidateName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setInterviewerName(String InterviewerName) {
        this.InterviewerName = InterviewerName;
    }

    public String getInterviewerName() {
        return this.InterviewerName;
    }

    public void setInterviewerEmpid(String InterviewerEmpid) {
        this.InterviewerEmpid = InterviewerEmpid;
    }

    public String getInterviewerEmpid() {
        return this.InterviewerEmpid;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}