package question2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import question1.InsertStudent;
import question1.StudentBeemClass;
import question1.studentConnectioninterface;

public class Main {
	
	
	public static void main(String[] args) {
//		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String date="1990-12-23";

		studentConnectioninterface student=new InsertStudent();
		String result=student.insertdate(date);
		System.out.println(result);
			

			
		
		
	}

}
