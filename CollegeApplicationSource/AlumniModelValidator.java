import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.virtusa.model.AlumniModel;

public class AlumniModelValidator {

	public boolean validate(AlumniModel model) {
		
		boolean result=false;
		
		if(validString(model.getFirstName()) && validString(model.getLastName()) && validNumber(model.getAlumniId()) && validNumber(model.getCourseId())
			&& validEmail(model.getEmail())){
			result=true;
		}
		
		
		return result;
	}
	
	
	public boolean validString(String val) {
		
		boolean result=false;
		char chars[]=val.toCharArray();
		List<Character> alphabets=new ArrayList<>();
		for(int i=97;i<=122;i++) {
			alphabets.add((char)i);
		}
		
		for(char ch:chars) {
			if(alphabets.contains(ch)) {
				result=true;
			}else {
				return false;
			}
		}
		return result;
	}

	public boolean validNumber(int number) {
		boolean result=false;
		String data=String.valueOf(number);
		if(data.matches(".*[0-9]")) {
			result=true;
		}
		return result;
	}
	
	
	
	public boolean validEmail(String email) {
		boolean result=false;
		if(email.matches("^(.+)@(.+)$")) {
			result=true;
		}
		return result;
	}
	public boolean validPhone(String phone) {
		Pattern p = Pattern.compile("[6-9][0-9]{9}"); 
        Matcher m = p.matcher(phone); 
        return (m.find() && m.group().equals(phone)); 
	}

}
