package com.virtusa.dao;

 

import java.sql.SQLException;
import java.util.List;

 


import com.virtusa.entities.Feedback;

 

public interface FeedbackDAO {

 

    public boolean giveFeedback(Feedback feedback)throws ClassNotFoundException, SQLException;
    public List<Feedback> viewFeedback() throws ClassNotFoundException, SQLException;
}
    