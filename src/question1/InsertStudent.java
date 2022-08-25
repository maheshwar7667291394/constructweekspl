package question1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent implements studentConnectioninterface{

	@Override
	public String insertStudentDetails(StudentBeemClass student) {
		String result="not inserted";
		
	   
	   
	   try (Connection con=Connecter.getConnect()){
		PreparedStatement ps=con.prepareStatement("insert into student1 values(?,?,?,?)");
		ps.setInt(1,student.getRoll());
		ps.setString(2,student.getName());
		ps.setString(3,student.getAddress());
		ps.setInt(4,student.getMarks());
		
		int x=ps.executeUpdate();
		if(x>0) {
			result="insertion secussfull";
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		return result;
	}

	@Override
	public String insertdate(String date) {
		String result="not inserted";
		
		 
		 
		 try (Connection con=Connecter.getConnect()){
			PreparedStatement ps=con.prepareStatement("insert into data values(?)");
			ps.setString(1, date);
			int x=ps.executeUpdate();
			if(x>0) {
				 result="insertion complete";
			}
		} catch (SQLException e) {
		     e.printStackTrace();
		}
		
		
		return result;
	}

	@Override
	public String insertIntoDeposit(String ACTNO, String CNAME, String BNAME, int AMOUNT, String ADATE) {
		String result="not inserted";
		
		try(Connection con=Connecter.getConnect()) {
			PreparedStatement ps=con.prepareStatement("insert into deposit values(?,?,?,?,?)");
			ps.setString(1,ACTNO);
			ps.setString(2,CNAME);
			ps.setString(3,BNAME);
			ps.setInt(4, AMOUNT);
			ps.setString(5, ADATE);
			int x=ps.executeUpdate();
			if(x>0) {
				result="insertion sucessfull";
			}
			
			
			
		} catch (SQLException e) {
		    
			e.printStackTrace();
		}
		
		return result;
	}




}
