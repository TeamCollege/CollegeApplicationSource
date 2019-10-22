
    
package com.virtusa.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.virtusa.entities.Alumni;
import com.virtusa.entities.Feedback;
import com.virtusa.integrate.ConnectionManager;


public class FeedbackDAOImpl implements FeedbackDAO {


    @Override
    public boolean giveFeedback(Feedback feedback) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        
        
   
        Connection conn=ConnectionManager.openConnection();
        PreparedStatement preparedStatement = conn.prepareStatement("insert into feedback values(?,?,?)");
        preparedStatement.setInt(1,  feedback.getFeedbackId());
        preparedStatement.setString(2, feedback.getName());
        preparedStatement.setString(3, feedback.getFeedback());
        
        int rows=preparedStatement.executeUpdate();
        ConnectionManager.closeConnection();
        
        if(rows>0)
            return true;
        else
            return false; 
            }


    @Override
    public List<Feedback> viewFeedback() throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        
        Connection connection=ConnectionManager.openConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=
                statement.executeQuery("select * from feedback");
        List<Feedback> feedbackList=new ArrayList<>();
        while(resultSet.next()) {
         Feedback feedback=new Feedback();
        feedback.setFeedbackId(resultSet.getInt("feedback_id"));
        feedback.setName(resultSet.getString("name"));
        feedback.setFeedback(resultSet.getString("feedback"));
        feedbackList.add(feedback);
        }
        ConnectionManager.closeConnection();
        return feedbackList;
    }



    
    
    
}
    
               








