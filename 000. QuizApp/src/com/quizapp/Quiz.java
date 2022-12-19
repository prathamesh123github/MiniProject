package com.quizapp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz  {

	Scanner sc = new Scanner(System.in);
	 
    public void logic(){
	
	int correctAnsCount=0;
	  int wrongAnsCount=0;
		
	Data q1 = new Data( "Q) Who invented java Programming ?", "A.Gudio Van Rossum", "B.James Gosling ", "C.Dennis Ritchie", "D.Bjarne Stroustrup");
	Data q2 = new Data( "Q) Which component is used to compile, debug & execute the java programs ?", "A.JRE", "B.JIT", "C.JDK ", "D.JVM");
	Data q3 = new Data( "Q) Which of the following is a super class of everyclass in java ?", "A.ArrayList", "B.Abstract class", "C.Object class", "D.String");
	Data q4 = new Data( "Q) Which of these keywords are used for the block to be examined for exceptions ?", "A.check", "B.throw ", "C.catch ", "D.try");
	Data q5 = new Data( "Q) Which one of the following is not an access modifier ?", "A.protected ", "B.void ", "C.public", "D.private");
	Data q6 = new Data( "Q) When does method overloading is determined ?", "A.At run time", "B.At complie time ", "C.At coding time ", "D.At execution time");
	Data q7 = new Data( "Q) Which of the following is a method having same name as that of its class ?", "A.finalize", "B.delete", "C.class", "D.constructor");
	Data q8 = new Data( "Q) Which of these return type of hasNext() method of an iterator ? ", "A.Integer", "B.Double", "C.Boolean", "D.Collections object");
	Data q9 = new Data( "Q) Which of these method of class String is used to compare two String objects for their equality ?", "A.equals()", "B.Equals()", "C.isequals()", "D.isequal()");
	Data q10 =new Data("Q) Which of these class extend InputStream class?", "A.ObjectStream", "B.ObjectOutput", "C.ObjectInputStream ", "D.ObjectInput");

	Map<Data, Character> hmap = new HashMap<>();
	hmap.put(q1, 'B');
	hmap.put(q2, 'C');
	hmap.put(q3, 'C');
	hmap.put(q4, 'D');
	hmap.put(q5, 'B');
	hmap.put(q6, 'B');
	hmap.put(q7, 'D');
	hmap.put(q8, 'C');
	hmap.put(q9, 'A');
	hmap.put(q10, 'C');
	
	for(Map.Entry <Data, Character> map:hmap.entrySet()) {
		
		
		System.out.println(map.getKey().getQuestion());
		System.out.println(map.getKey().getChoice1());
		System.out.println(map.getKey().getChoice2());
		System.out.println(map.getKey().getChoice3());
		System.out.println(map.getKey().getChoice4());
		
		System.out.println("Enter Your Answer: ");
		Character ans = sc.next().charAt(0);
		
		int cans=Character.compare(ans, map.getValue());
		
		if(cans==0) {
			System.out.println("Correct");
			correctAnsCount++;
			}
		else {
			System.out.println("Wrong");
			wrongAnsCount++;
		}
	}
	
	System.out.println();
	System.out.println("----------Result----------");
	System.out.println("Total Questions : " +hmap.size());
	System.out.println("Correct Answered Questions : " +correctAnsCount);
	System.out.println("Wrong Answered Questions : " +wrongAnsCount);
	

	if(correctAnsCount > 8) {
		System.out.println( "Class-A");
	}
	else if(correctAnsCount > 6) {
		System.out.println( "Class-B");
	}
	else if(correctAnsCount > 5) {
		System.out.println("Class-C");
	}
	else {
		System.out.println( "fail...!");
	}
	
  }
}




