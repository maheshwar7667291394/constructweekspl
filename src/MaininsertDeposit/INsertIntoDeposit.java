package MaininsertDeposit;

import java.util.Scanner;

import question1.InsertStudent;
import question1.studentConnectioninterface;

public class INsertIntoDeposit {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter ACTNO");
		String actno=input.next();
		
		System.out.println("Enter CNAME");
		String cname=input.next();
		
		System.out.println("Enter BNAME");
		String bname=input.next();
		
		System.out.println("Enter Amount");
		int amount=input.nextInt();
		
		System.out.println("Enter DATE in yyyy-MM-dd formate");
		String date=input.next();
		
		studentConnectioninterface dteinsert= new InsertStudent();
		String result=dteinsert.insertIntoDeposit(actno, cname, bname, amount, date);
		 
		System.out.println(result);
		
		
		
		
	}

}
