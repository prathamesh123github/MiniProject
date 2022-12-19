package com.quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertOption {

	Connection connection = null;
	PreparedStatement ps= null;
	
	public void insertoptioninfo(String A, String B, String C, String D) throws SQLException {
		
		try {
			ConnectionTest ct = new ConnectionTest();
			connection=ct.getConnectionDetails();
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "Gudio Van Rossum");
			ps.setString(2, "James Gosling");
			ps.setString(3, "Dennis Ritchie");
			ps.setString(4, "Bjarne Stroustrup");
			int i =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
	
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "JRE");
			ps.setString(2, "JIT");
			ps.setString(3, "JDK");
			ps.setString(4, "JVM");
			int i2 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "ArrayList");
			ps.setString(2, "Abstract class");
			ps.setString(3, "Object class");
			ps.setString(4, "String");
			int i3 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "check");
			ps.setString(2, "throw");
			ps.setString(3, "catch");
			ps.setString(4, "try");
			int i4 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "protected");
			ps.setString(2, "void");
			ps.setString(3, "public");
			ps.setString(4, "private");
			int i5 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "At run time");   
			ps.setString(2, "At Compile time");       
			ps.setString(3, "At coding time");         
			ps.setString(4, "At execution time");  
			int i6 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "finalize");
			ps.setString(2, "delete");
			ps.setString(3, "class");
			ps.setString(4, "constructor");
			int i7 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "Integer");
			ps.setString(2, "Double");
			ps.setString(3, "Boolean");
			ps.setString(4, "Collections object");
			int i8 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "equals()");
			ps.setString(2, "Equals()");
			ps.setString(3, "isequal()");
			ps.setString(4, "isequals()");
			int i9 =ps.executeUpdate();
			System.out.println("Record is inserted succesfully..." +i);
			
			ps=connection.prepareStatement("insert into optioninfo(A,B,C,D)values(?,?,?,?)");
			ps.setString(1, "ObjectStream");
			ps.setString(2, "ObjectOutput");
			ps.setString(3, "ObjectInputStream");
			ps.setString(4, "ObjectInput");
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
