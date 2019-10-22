package com.virtusa.helper;

 


import com.virtusa.service.FeedbackService;
import com.virtusa.service.FeedbackServiceImpl;

 

public class FactoryFeedbackService {

 

    public static FeedbackService createFeedbackService() {
        // TODO Auto-generated method stub
        
        FeedbackService feedbackService=new FeedbackServiceImpl();
        return feedbackService;
        
    }

 

}