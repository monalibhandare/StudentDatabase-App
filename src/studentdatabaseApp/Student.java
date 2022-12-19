package studentdatabaseApp;

import java.util.Scanner;
public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentid;
	private String courses;
	private int tutionbalance=0;
	private static int costofcourse=600;
	private static int id=1000;
	
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter student firstname: ");
		this.firstname=in.nextLine();
		
		System.out.print("Enter the student lastname: ");
		this.lastname=in.nextLine();
		
		System.out.print("1- freshmen\n2 - sophmore\n3 - junior\n4 - senior\nEnter student class level:  ");
		this.gradeyear=in.nextInt();
		
		setstudentid();
		
		System.out.println(firstname+ " " + lastname+ " "+ gradeyear+" " +studentid);
	}
	
	private void setstudentid() {
		id++;
		this.studentid= gradeyear+ ""+ id;
	}
	
	
	public void enroll() {
	do {
		System.out.println("Enter course to enroll (Q to quit): "); 
		Scanner in= new Scanner(System.in);
		String course= in.nextLine();
		if(!course.equals("Q")) {
			courses= courses + "\n  " + course;
			tutionbalance= tutionbalance+ costofcourse;
		}
		else {
			
			break;
		}
	}
	while(1 !=0);		
	}
	
	public void viewbalance() {
		System.out.println("Your balace is : $"+ tutionbalance);
	}
	
	public void paytution() {
		viewbalance();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your payment in: $");
		int payment=in.nextInt();
		tutionbalance= tutionbalance -payment;
		System.out.println("Thank you for payment of $"+ payment);
		viewbalance();
		System.out.println("*****************************");
		
		
	}
	
	public String toString() {
		return "Name: "+ firstname + " " + lastname +
		"\nGrade level: "+ gradeyear+
		"\nStudent Id: "+ studentid+
		"\ncourses Enrolled: " + courses +
		"\nbalance: $" + tutionbalance;
				
	}
	
}
