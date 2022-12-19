package com.quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws SQLException {
		
	       //------To Insert Questions into Database-------//
		
		InsertQuestion iq = new InsertQuestion();
		iq.insertquestioninfo(null);
		
		//-------To Insert Student name,marks & grade into database------//
		 Quiz qz= new Quiz();
	     Scanner sc = new Scanner(System.in);
	     
	     for(int i=1; i<=2; i++) {
		   
		    System.out.println("Enter name>> ");
		    String name=sc.next();
		
		    qz.logic();
		
		    System.out.println("Enter marks>> ");
		    int marks=sc.nextInt();
		
	        System.out.println("Enter Grade>>");
	         String grade=sc.next();
	  
	        InsertStudentInfo isi= new InsertStudentInfo();
	        isi.insertstudentinfo(name, marks, grade);
	    }
	     sc.close();     
	     
	     
	     //-------------Insert Option into Database----------------//
	     
	     InsertOption io= new InsertOption();
	     io.insertoptioninfo(null, null, null, null);         
	     
	     
	     //------------Insert Answer into database-------------------//
	     
	     InsertAnswer ia= new InsertAnswer();
	     ia.insertanswerinfo(null);

	}

}
