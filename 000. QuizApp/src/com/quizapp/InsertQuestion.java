package com.quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertQuestion {
	
	Connection connection = null;
	PreparedStatement ps= null;
	
	public void insertquestioninfo(String questions) throws SQLException {
		
		try {
			ConnectionTest ct = new ConnectionTest();
			connection=ct.getConnectionDetails();
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q1) Who invented java Programming ?");
			int i =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
	
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q2) Which component is used to compile, debug & execute the java programs ?");
			int i2 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q3) Which of the following is a super class of everyclass in java ?");
			int i3 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q4) Which of these keywords are used for the block to be examined for exceptions ?");
			int i4 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q5) Which one of the following is not an access modifier ?");
			int i5 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q6) When does method overloading is determined ?");
			int i6 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q7) Which of the following is a method having same name as that of its class ?");
			int i7 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q8) Which of these return type of hasNext() method of an iterator ?");
			int i8 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q9) Which of these method of class String is used to compare two String objects for their equality ?");
			int i9 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into questioninfo(questions)values(?)");
			ps.setString(1, "Q10) Which of these class extend InputStream class?");
			int i10 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
		}
		catch(Exception e) {
			System.out.println(e);
			}
		finally {
			connection.close();
			ps.close();
		}
	}
	
}
