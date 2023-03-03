/*
 Program : Write a program to initialize a HashMap in java ?
 @Author : Rajshree Gaikwad
 @Date   : 3rd March2023
  */
package PractiseAssignment7;

import java.util.HashMap;

//declaring class
public class Prog1 {

	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      //for initializing HashMap
				HashMap<String,Integer>data=new HashMap<String,Integer>();
				//Values
				data.put("a", 100);
				data.put("b", 200);
				data.put("c", 500);
				System.out.println("values"+" "+data); //for printing  values of data

	} //end of main method

} //end class
