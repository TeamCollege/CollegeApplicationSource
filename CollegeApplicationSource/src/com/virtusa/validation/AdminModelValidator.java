package com.virtusa.validation;

import java.util.ArrayList;
import java.util.List;

public class AdminModelValidator
{
	public boolean validNumber1(String number) {
        boolean result=false;
    //    String data=String.valueOf(number);
       
/*        if(data.matches(".*[0-9]"))
            return false;
        else
            return true;
    */
        try {
            int test=Integer.parseInt(number);
            result =false;
        }
        catch(NumberFormatException e)
        {
            System.out.println("-----------------Enter Data in Numbers Only ----------------");
           
            result=true;
        }
       
        return result;
    }
   
	
	public boolean validString1(String val) {
	       
        boolean result=false;
        char chars[]=val.toCharArray();
        List<Character> alphabets=new ArrayList<>();
        for(int i=97;i<=122;i++) {
            alphabets.add((char)i);
        }
       
        for(char ch:chars) {
            if(alphabets.contains(ch))
                result=true;
            else if(!(alphabets.contains(ch)))
                result=false;
                            }       
       
       
        return result;
    }

}
