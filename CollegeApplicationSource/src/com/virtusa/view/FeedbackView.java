package com.virtusa.view;

 

import java.util.List;
import java.util.Scanner;

 

import com.virtusa.controller.FeedbackController;
import com.virtusa.entities.Feedback;

 

import com.virtusa.model.FeedbackModel;

 

public class FeedbackView {
    
    public void feedbackMenu() {
        
        System.out.println("1.Give Feedback");
        System.out.println("2.View Feedback");
        System.out.println("3.Exit");
        System.out.println("Enter your choice:");
        
        try(Scanner sc=new Scanner(System.in);){  
            int choice=sc.nextInt();
                 
        
        switch(choice) {
          
        case 1:giveFeedback();
               break;
        case 2:viewFeedback();   
               break;
        case 3:System.exit(0);
        break;
        default:System.out.println("[SELECT APPROPRIATE OPTION]");
        feedbackMenu();
    }
    }catch(Exception e) {
        System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
    }
}

 

    public void  viewFeedback() {

 

        FeedbackController feedbackController =new FeedbackController();
        feedbackController.viewFeedback();
        }

 

    public void giveFeedback() {

 

        
          try(Scanner scanner=new Scanner(System.in);){
                   
                System.out.println("Enter  Name");
                String name=scanner.next();
                System.out.println("Give Feedback:");
                String feedback=scanner.next();
                
        FeedbackModel model=new FeedbackModel();
            
             model.setName(name);
             model.setFeedback(feedback);
             FeedbackController controller=new FeedbackController();
             controller.giveFeedback(model);
             
             feedbackMenu();
            
                
          }catch(Exception e) {
                e.printStackTrace();
            }
            }

 

    public void showFeedbackSubmitted() {

 

        
        System.out.println("Feedback Subimitted Sucessfully!");
        
    }

 

    public void showFeedbackFailure() {

 

        
        System.out.println("Feedback submission Failure due to some internal issues!");
        
    }

 

    public void showFeedbackDetails(List<FeedbackModel> models) {
        

 

        for(FeedbackModel model:models) {
            System.out.println("\n ------- View Feedback-------");
            System.out.println("Name:" +model.getName());
            System.out.println(" Feedback:" +model.getFeedback());
            feedbackMenu();
        }
    }
}