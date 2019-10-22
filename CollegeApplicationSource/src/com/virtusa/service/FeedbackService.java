package com.virtusa.service;

 

import java.util.List;

 

import com.virtusa.entities.Feedback;
import com.virtusa.model.FeedbackModel;

 

public interface FeedbackService {

 

    public String giveFeedback(FeedbackModel model);
    
    public List<FeedbackModel> viewFeedback();
        
}