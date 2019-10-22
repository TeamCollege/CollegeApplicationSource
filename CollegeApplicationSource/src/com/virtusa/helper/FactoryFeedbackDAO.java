package com.virtusa.helper;

 


import com.virtusa.dao.FeedbackDAO;
import com.virtusa.dao.FeedbackDAOImpl;

 

public class FactoryFeedbackDAO {

 

public static FeedbackDAO createFeedbackDAO(){
        
        FeedbackDAO feedbackDAO = new FeedbackDAOImpl();
        return feedbackDAO;
        
    }
}