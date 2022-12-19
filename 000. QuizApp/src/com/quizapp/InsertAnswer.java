package com.quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertAnswer {


	Connection connection = null;
	PreparedStatement ps= null;
	
	public void insertanswerinfo(String answer) throws SQLException {
		
		try {
			ConnectionTest ct = new ConnectionTest();
			connection=ct.getConnectionDetails();
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "James Gosling");
			int i =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
	
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "JDK");
			int i2 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "Object class");
			int i3 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "try");
			int i4 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "void");
			int i5 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "At Compile time");       
			int i6 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "constructor");
			int i7 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "Boolean");
			int i8 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "equals()");
			int i9 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into answerinfo(answer)values(?)");
			ps.setString(1, "ObjectInputStream");
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
