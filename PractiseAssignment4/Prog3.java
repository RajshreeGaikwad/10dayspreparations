
/*
 Program: Create an interface called "BankAccount" with methods called "deposit" and "withdraw". 
          Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods. 
          Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods. 
 @Author : Rajshree Gaikwad
 @Date   : 28th feb 2023
 */



package PractiseAssignment4;


//declaring interface

interface BankAccount 
{
	//declaring method of deposit
	public void deposit();
	
	//declaring method of withdraw
	public void withdraw(); 
	
} //end of interface


//declaring subclass which is  implements interface 
class CheckingAccount implements BankAccount
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
		System.out.println("Amount is Deposited");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Amount is withdrwal");
		
	}

	
} //end of subclass


//declaring main class
public class Prog3 {

	//calling main method
	public static void main(String[] args) 
	{
		//creating object of subclass
		CheckingAccount ca=new CheckingAccount();
		ca.deposit(); //calling method of deposit
		
		//calling method of withdraw
		
		ca.withdraw();
		
		
	} //end of main method

} //end of main class

