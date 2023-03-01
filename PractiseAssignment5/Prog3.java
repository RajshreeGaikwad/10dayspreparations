/*
 Program : Create two thread.one thread is finding average of first 10 numbers and other thread is printing square of number 
           store in array arr={1,20,50,15,30} and make sure both thread can execute one by one.
 @Author : Rajshree Gaikwad
 @Date   : 1st March 2023
           */
package PractiseAssignment5;

//declaring class
public class Prog3 {

	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(){
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++) //using for loop
                {   
                    sum += i;   //for adding 1 to 10 numbers
                } 
              //for finding average of  sum
                double average = (double) sum / 10;  
                System.out.println("Average of first 10 numbers: " +" "+ average);  //for printing average
            }
		};
		
		//for starting average of printing
		th.start();  
        int[] arr = {1, 20, 50, 15, 30}; //arrayList

        //creating new thread
        Thread th1 = new Thread()
        {
            public void run()
            {
                System.out.print("Square of numbers:");
                for (int i = 0; i < arr.length; i++) //using for loop
                  {
                   //for finding square
                	int square = arr[i] * arr[i];     
                    System.out.print(square + " ");  //for printing  square
                }
            }
            };

            
            th1.start();  //for starting square printing
          
            
	}//end of main method

} //end of class
