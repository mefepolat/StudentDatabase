package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		

		
		// Ask how many new users we want to add
		
		System.out.println("Enter number of new students to enroll: ");
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfStudents = sc.nextInt();
		
		Student[] students = new Student[numberOfStudents];
		
		// Create n number of new students

		for (int n = 0; n < numberOfStudents; n++) {
			
			
			
			students[n] = new Student();
			
			students[n].enroll();
			
			students[n].payTuition();
			
			System.out.println(students[n].showInfo());
			
		}
		
	}

}
