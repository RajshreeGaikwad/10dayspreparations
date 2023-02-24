/*
 Program: write a java program Design and implement three classes Student. Subject and Teacher
Student will have Name, Roll Number, and Subject which is another class itself
which in turn has Subject Name and Subject marks Now write a program that does the following
Instantiates 10 students, you chose any name and roll number Each student will have the subject array with two subjects: Maths, English The program must instantiate one Teacher instance and take her (User) input to set the marks for
10 students Then it should prompt the teacher to do the following
Find average of marks
Find Max and Min and display the marks
@Author: Rajshree Gaikwad
@Date  :  23rd Feb 2023
*/



package basic;

import java.util.Scanner;

//declaring class 
class Subject {
	
	//declaring instance variable
	String subjectName;
    int subjectMarks;
    
    
    //using parameterized constructor
    
    public Subject(String name) {
        this.subjectName = name;
        this.subjectMarks = 0;
    }
    
    //generating getter setter method
    public void setMarks(int marks) {      
        this.subjectMarks = marks;
    }
} //end class of Subject


//declaring class 
 class Student {

	 //declaring instance variable
	 String name;
	 int rollNumber;
	 Subject[] subjects;   // has-a relationship
	    
	 //parameterized constructor
	    public Student(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.subjects = new Subject[2];
	        this.subjects[0] = new Subject("Maths"); 
	        this.subjects[1] = new Subject("English");
	    }
   
} //end class of Student
 
 
 //declaring class
public class Teacher {

public void setMarks(Student student) {
		
        Scanner sc = new Scanner(System.in);  // using scanner class
        
        System.out.println("Roll No: "+student.rollNumber); //for printing
        System.out.println("Enter marks for "+student.name); //for printing
        
        
        for (Subject subject : student.subjects) 
        {
            System.out.print(subject.subjectName + ": ");
            int marks = sc.nextInt();
            subject.setMarks(marks);
        }
    }
	
	
	public static void main(String[] args) {
	
		//adding student name and roll number
		
	    Student[] students = new Student[10];
	    
	    students[0] = new Student("Kashish", 1);
	    students[1] = new Student("Shreya", 2);
	    students[2] = new Student("Priya", 3);
	    students[3] = new Student("Yash", 4);
	    students[4] = new Student("Jigar", 5);
	    students[5] = new Student("Swaraj", 6);
	    students[6] = new Student("Samantha", 7);
	    students[7] = new Student("Prabhas", 8);
	    students[8] = new Student("Eshwari", 9);
	    students[9] = new Student("Shubhrada", 10);

	    Teacher teacher = new Teacher();
        for (Student student : students) 
        {
            teacher.setMarks(student);
        }
        
     // Finding the maximum and minimum marks
        
        int totalMarks = 0;
        int maxMarks = Integer.MIN_VALUE;
        int minMarks = Integer.MAX_VALUE;
        for (Student student : students) 
        {
            for (Subject subject : student.subjects) 
            {
                totalMarks += subject.subjectMarks;
                maxMarks = Math.max(maxMarks, subject.subjectMarks);   
                minMarks = Math.min(minMarks, subject.subjectMarks);
            }
        }
        
        int averageMarks = totalMarks / (students.length * 2);
        System.out.println("Average marks: " + averageMarks);   // for printing average mark
        System.out.println("Maximum marks: " + maxMarks);      //for printing maximum mark
        System.out.println("Minimum marks: " + minMarks);     // for printing minimum mark
	}

}

