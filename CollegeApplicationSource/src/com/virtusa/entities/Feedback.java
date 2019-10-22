package com.virtusa.entities;

 

public class Feedback {
    
    private int feedbackId;
    private String name;
    private String feedback;
    
    public String getFeedback() {
        return feedback;
    }    
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public int getFeedbackId() {
        return feedbackId;
    }
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Feedback [feedbackId=" + feedbackId + ", name=" + name + ", feedback=" + feedback + ", getFeedback()="
                + getFeedback() + ", getFeedbackId()=" + getFeedbackId() + ", getName()=" + getName() + "]";
    }
    
    
     

 

}