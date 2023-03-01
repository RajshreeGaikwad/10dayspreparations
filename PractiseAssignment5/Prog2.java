/*
 Program : Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.
          1. Adds the string”- This is a sample program” to existing string and display it.
          2. Inserts the string “Object” into the existing string at 21st postion and display it.
          3. Reverses the entire string and displays it.
          4. Replaces the word “Buffer” with “Builder” and display it.
@Author   : Rajshree Gaikwad
@Date     :1st March 2023
           */
package PractiseAssignment5;

//declaring class
public class Prog2 {

	//calling main method
	public static void main(String[] args) {
	
		
		// creating StringBuffer
	
		StringBuffer sb=new StringBuffer("This is a StringBuffer");
		
		//for adding String using append method
		 sb.append("- This is a sample program");
	       System.out.println("  After adding  a new String : "+" "+sb); //for printing output of adding method

	    //for inserting object into existing string  using insert method
	       sb.insert(21,"object");
	       System.out.println(" After inserting a String is : "+" "+sb); //for printing output of inserting method
	       
	     //for  Reverses the entire string using reverse method
	       sb.reverse();
	       System.out.println("After reversing a entire String : "+" "+sb); //for printing output of reversing method
	
	     // for Replaces the word “Buffer” with “Builder” using indexOf method and replace method
	       int x=sb.indexOf("Buffer");
	       int y=x + "Buffer".length(); 
	       sb.replace(x, y, "Builder");
	       System.out.println("After replacing StringBuffer into StringBuilder :"+" "+sb);
	       
	
	} //end of main method

} //end of class
