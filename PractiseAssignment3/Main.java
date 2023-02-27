/*
 Program: Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
          Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and 
          call both the "drive" and "honk" methods.
 @Author: Rajshree Gaikwad
 @Date  : 27th feb 2023
        */
package PractiseAssignment3;

//declaring parent class
class Vehicle
{
	//no Args constructor
	public Vehicle()
	{
		
	}


 //declaring instance variable
	String Brand="Honda";
	String model="civic";
	int year=2000;
	
	//parameterized constructor
public Vehicle(String brand, String model, int year) {
		super();
		Brand = brand;
		this.model = model;
		this.year = year;
	}
 //declaring method
 	public void drive() 
	{
		System.out.println("its driving"); //for printing drive method
	}
	
} //end of class Vehicle


//declaring child class which is extend parent class
class Car extends Vehicle
{
	//declaring instance variable
	String color="Black";
	
	//no Args constructor
	public Car()
	{
		
	}
	
	//parameterized constructor
	
	public Car(String color) {
		super();
		this.color = color;
	}


	public Car(String brand, String model, int year) {
		super(brand, model, year);
		// TODO Auto-generated constructor stub
	}


	//declaring method
	public void honk()
	{
	System.out.println("its honking");	 //for printing method
	}
} //end of class Car

//declaring main class
public class Main {

	//calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//creating object of child class
		Car obj =new Car();
		obj.drive(); //calling method from parent class
		obj.honk(); //calling method from child class
		
		//for printing values of class 
		System.out.println("Brand"+" "+obj.Brand+" "+"Model"+" "+obj.model+" "+"year"+" "+obj.year+" "+"colour"+" "+obj.color);
		

	} //end of main method

} //end f main class
