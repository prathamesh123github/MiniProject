package com.quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InsertStudentInfo {
	
	Connection connection = null;
	PreparedStatement ps= null;
	
	public void insertstudentinfo(String name, int marks, String grade) throws SQLException {
		
		try {
			ConnectionTest ct = new ConnectionTest();
			connection=ct.getConnectionDetails();
			
			ps=connection.prepareStatement("insert into studentinfo(name,marks,grade)values(?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, marks);
			ps.setString(3, grade);
			
			int i =ps.executeUpdate();
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