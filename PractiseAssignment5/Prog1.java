/*
 Program: Write a program which creates a String “Welcome to Java World” and performs the following
         • Returns the character at 5th position and display it.
         • Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
         • Concatenates “- Let us learn” to the above string and display it.
         • Returns the position of the first occurrence of character ‘a’ and display it.
         • Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
         • Returns string between 4th position and 10th position and display it.
         • Returns the lowercase of the string and display it.
@Author : Rajshree Gaikwad   
@Date   :1st March 2023
      */


package PractiseAssignment5;

//declaring class
public class Prog1 {

	//calling main method
	public static void main(String[] args) {
		// creating string
		String str="Welcome To Java World";
		
		//for find the character at 5th position using charAt method
		char ch=str.charAt(5);
		System.out.println("character at 5th position"+" "+ch); //for printing character at 5th position
		
		//for compare String with “Welcome” lexicographically ignoring case differences using equalsIgnoreCase method
		boolean b=str.substring(0,7).equalsIgnoreCase("welcome");
		System.out.println("This String is same"+" "+b); //for printing result
		
		//for Concatenates “- Let us learn” to the above string using concate method
		String str1=str.concat("-Let us learn");  
		System.out.println("This is new String:"+" "+str1); //for printing new string using concat

		//for finding the first occurrence of character ‘a’ using indexOf method
		int x=str.indexOf('a');
		 System.out.println("first occurrence is:"+" "+x); //for printing first occurrence of a
	
		 //for Replaces all the occurrences of ‘a’ character with the new ‘e’ using replace method
		 String str2=str.replace('a','e');
	        System.out.println("replace a string:"+" "+str2); //for printing output of replacing
	        
	      //for finding string between 4th position and 10th position using substring method
	        String str3=str.substring(5, 10);
	        System.out.println(" string between  4th and 10th position is:"+" "+str3); //for printing strings position
	       
	       // for Returns the lowercase of the string using toLowerCase method
	        String str4=str.toLowerCase();
	        System.out.println("string after lowercase:"+" "+str4);
	
	} //end of main method

} //end of class
