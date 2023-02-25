/* 
 Program:Write a program that asks the user to input five integers and stores 
         them in an array. The program should then find and print the sum and average 
         of the values in the array.
 @Author:Rajshree Gaikwad
 @Date:25th feb 2023
         */
package PractiseAssignment2;

import java.util.Scanner;

//declaring class
public class Main {

	//calling main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for user input
		int []a=new int[5];
		
		int sum=0;
		System.out.println("Enter array element:"); //for enter array elements
		for(int i=0;i<5;i++) //using loop
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements are:"+" "); //for printing elements
		for(int i=0;i<5;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("sum and average of elements are:"); //for printing sum and average of elements
	for(int element:a) //using loop
	{
		sum=sum+element;
	}
	System.out.print("sum of elements are:"+sum+"average of sum:"+sum/a.length+"");
	
} //end of main method
} //end class of main
