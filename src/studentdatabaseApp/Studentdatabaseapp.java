package studentdatabaseApp;

import java.util.Scanner;

public class Studentdatabaseapp {
	public static void main(String args[])
	{
		System.out.println("Enter number of new student to enroll: ");
		Scanner in=new Scanner(System.in);
		int numofstudents= in.nextInt();
		Student[] students= new Student[numofstudents];
		
		for(int n=0; n<numofstudents; n++)
		{
			students[n]=new Student();
			
			students[n].enroll();
			students[n].paytution();
		}
		System.out.println();
		
		for(int n=0; n<numofstudents; n++) {
			System.out.println(students[n].toString());
			System.out.println("*********");
			
			
		}
		
		
			
	}
	

}
