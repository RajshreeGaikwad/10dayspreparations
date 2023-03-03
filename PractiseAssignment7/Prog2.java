/*
 Program : Write a program to add elements to the HashMap given the key and value data type is String?
 @Author : Rajshree Gaikwad
 @Date   : 3rd March 2023
 */
package PractiseAssignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//declaring class
public class Prog2 {

	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashMap
		Map<Integer,String> data=new HashMap<>();
		// values
		data.put(101,"Jaya");
		data.put(102,"Sushama");
		data.put(103,"Rakhee");
		data.put(105,"Swara");
		
		//use keyset for key and  values
		for(Integer s:data.keySet())
		{
			System.out.println("key"+" "+s+" "+"value"+" "+data.get(s)); //for printing output of key and value
		}

	} //end main method

} //end class
