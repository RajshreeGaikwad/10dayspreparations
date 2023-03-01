/*
 Program : Create two threads to print odd numbers and even numbers from 1 to 100?
           note: after printing of all odd numbers only Even numbers should print. 
 @Author : Rajshree Gaikwad
 @Date   : 1st March 2023
           */
package PractiseAssignment5;

//declaring  class
public class Prog4
{

	//calling main method
	public static void main(String[] args)
	{
		// creating  1st thread
		Thread th1=new Thread()
		{
		
		//declaring run method
		      public void run() 
		{
		   //using for loop for odd numbers
			for (int i = 1; i < 100; i+=2)   
			{
				System.out.println(i);  //for printing odd numbers
				
			}
		}
   };
   
   
         //creating 2nd thread
           Thread th2= new Thread ()  
			{
        	   //declaring run method
		      public void run()  
		{
		   //using for loop for even numbers 	  
			for (int i = 2; i < 100; i+=2)   
			{
				System.out.println(i);  //for printing even numbers
				
			}
		}
 };
	   
				th1.start();  //calling 1st thread
				
				th2.start();  //calling 2nd thread 
				
	} //end of main method

} //end of class
