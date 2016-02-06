// OOP
// OOAD
// SRP - 
// OOP - Encapsulation - Binding Data and Methods into Single Unit 
// e.g Class is an Example of Encapsualtion
// Data Hiding - private 
// Good Encapsulation - Data Hiding + Data Binding
// private Member Variables + public Member Methods
public class Student {
	// Scope is only with in the class
private int rollno;  // Data Members
private String name;
private String course;
private double fees;
private String collegeName="ABES";
/*
 * Constructor Name is Same as Class Name
 * Constructor is used to intalize the member variables
 * Constructor does not return any thing.
 * And it is call when object is created.
 */
// This is called Constructor
// Default Constructor
Student(){
	this(1001,"Ram","BCA",44444);
	collegeName = "ABES";
	/*rollno = 1001;
	name="Ram";
	course = "MCA";
	fees = 99999;
	System.out.println("Student Class Default Cons Call");*/
	
}
Student(int rollno, String name, String course, double fees){
	//Student();
	//this(); // this will default constructor of a class
	this.rollno = rollno + collegeName.length();
	this.name = name;
	this.course = course;
	this.fees = fees;
	//this();
}


// Member Methods

public void takeInput(int rollno, String name , String course , double fees){
	if(rollno<=0){
		System.out.println("Invalid Rollno");
		return ;
	}
	if(fees<=0){
		System.out.println("Invalid Fees");
		return;
	}
	this.rollno = rollno;
	this.name = name;
	this.course = course;
	this.fees  = fees;
			
}

public void print(){
	System.out.println("Rollno "+this.rollno);
	System.out.println("Name "+name);
	System.out.println("Course "+course);
	System.out.println("Fees "+fees);
	System.out.println("College Name "+collegeName);
}
}
