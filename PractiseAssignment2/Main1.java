/*
  Program:Write a program that asks the user to input ten integers and stores them in an array. 
    The program should then find and print the smallest and largest values in the array.
  @Author: Rajshree Gaikwad
  @Date:25 th feb 2023  
 */

package PractiseAssignment2;

import java.util.Scanner;

//declaring class
public class Main1 {

	//calling main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //user input
        int[] array = new int[10];

        System.out.println("Enter ten integers:"); //for enter array
        for (int i = 0; i < array.length; i++) //using loop
        {
            array[i] = sc.nextInt();
        }

        
        int smallest = array[0];
        int largest = array[0];
        for (int i = 1; i < array.length; i++)  //using loop
        {
            if (array[i] < smallest) 
            {
                smallest = array[i];
            }
            if (array[i] > largest) 
            {
                largest = array[i];
            }
        }

        
        System.out.println("Smallest value: " + smallest); //for printing smallest value of array
        System.out.println("Largest value: " + largest); //for printing largest value of array
    } //end of main method

} //end of class
