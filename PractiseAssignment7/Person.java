/*
 Program : Create a Person class and create an array list to add 10 person objects and print
           them using a for each loop:
 @Author : Rajshree Gaikwad
 @Date   : 3rd March 2023
 */
package PractiseAssignment7;

import java.util.ArrayList;
import java.util.List;

//declaring class
public class Person {

	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating Arraylist
		List<String> object=new ArrayList<>();

		//adding values of arrayList
		object.add("Rajshree");
		object.add("Prerana");
		object.add("Khushi");
		object.add("Teena");
		object.add("Swaraj");
		object.add("Shrinil");
		object.add("kimaya");
		object.add("Karan");
		object.add("Rahul");
		object.add("Karthik");
		//using loop
		for(String s:object)
		{
			System.out.println(s); //for printing output of arrayList
		}
		
	} //end main method

}//end class
