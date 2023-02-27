/*
 Program: Create a parent class called "Person" with attributes such as name, age, and a method 
         called "speak". Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". 
         Create an object of the Student class and call both the "speak" and "study" methods.
 @Author:Rajshree Gaikwad
 @Date   :27 feb 2023
         */

package PractiseAssignment3;
 

//declaring parent class
class Person
{
	//declaring instance variable
	String name="Rajshree";
	int age=29;
	
	//no args constructor
	public Person() 
	{
		
	}
	//parameterized constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//declaring  method
	
	public void speak()
	{
		System.out.println("Speaking"); //for printing method speak
	}
	
	
	
	
} //end of class Person


//declaring child class which is extend parent class
class Student extends Person
{
	//declaring instance variable
	String grade="A";

	//no args constructor
	public Student() 
	{
		
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Student(String grade) {
		super();
		this.grade = grade;
	}
	
	//declaring method
	public void study()
	{
		System.out.println("Studying"); //for printing method study
	}
		
	
} //end of class Student


//declaring  class
public class Prog2 {

	//calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//creating object of child class
		
		Student st=new Student();
		st.speak(); //calling method from parent class
		st.study(); //calling method from child class
		
		//for printing values of child class and parent class
		System.out.println("Name"+" "+st.name+" "+"Age"+" "+st.age+" "+"Grade"+" "+st.grade);
		
		
		

	} //end of main method

} //end of class
