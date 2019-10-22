package com.virtusa.service;

 


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 

import com.virtusa.dao.FeedbackDAO;

 

import com.virtusa.entities.Feedback;

 

import com.virtusa.helper.FactoryFeedbackDAO;

 

import com.virtusa.model.FeedbackModel;

 

public class FeedbackServiceImpl implements FeedbackService{
    
    private FeedbackDAO feedbackDAO;
    public FeedbackServiceImpl(){
        this.feedbackDAO=FactoryFeedbackDAO.createFeedbackDAO();
        }
    
    
    @Override
    public String giveFeedback(FeedbackModel model) {
        // TODO Auto-generated method stub
        
        
        Feedback feedback=new Feedback();
        feedback.setFeedbackId(model.getFeedbackId()); 
        feedback.setName(model.getName());
        feedback.setFeedback(model.getFeedback());
        
        String result="fail";
        try {
            boolean stored=feedbackDAO.giveFeedback(feedback);
            if(stored)
                result="success";
            
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("!ERROR[Feedback failure because of internal issues...]");
        }
        return result;
    }

 

@Override
    public List<FeedbackModel> viewFeedback() {
        
    List<FeedbackModel> feedbackModelList=new ArrayList<>();
    try {
        List<Feedback> feedbackList=feedbackDAO.viewFeedback();
        for(Feedback feedback:feedbackList) {
            FeedbackModel feedbackModel=new FeedbackModel();
            feedbackModel.setFeedbackId(feedback.getFeedbackId());
            feedbackModel.setName(feedback.getName());
            feedbackModel.setFeedback(feedback.getFeedback());
            feedbackModelList.add(feedbackModel);
            
        }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return feedbackModelList;
    }
}