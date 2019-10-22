package com.virtusa.controller;

 

import java.util.List;

 

import com.virtusa.entities.Feedback;
import com.virtusa.helper.FactoryFeedbackService;
import com.virtusa.model.AlumniModel;
import com.virtusa.model.FeedbackModel;
import com.virtusa.service.FeedbackService;
import com.virtusa.validation.AlumniModelValidator;
import com.virtusa.view.FeedbackView;

 

public class FeedbackController {
    
    private FeedbackService feedbackService;       
    FeedbackView feedbackview=new FeedbackView();
    public FeedbackController(){
        this.feedbackService=FactoryFeedbackService.createFeedbackService();

 

        
    }
        
public void giveFeedback(FeedbackModel model) {
    
    String outcome=feedbackService.giveFeedback(model);
    if(outcome.contentEquals("success")) {
        feedbackview.showFeedbackSubmitted();    
    }else {
        feedbackview. showFeedbackFailure();
    }
   
}
public void viewFeedback() {
    
    List<FeedbackModel> models=feedbackService.viewFeedback();
    
    feedbackview.showFeedbackDetails(models);
            
}
     
}