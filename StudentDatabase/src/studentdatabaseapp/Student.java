package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int gradeLevel;
	private String courses = null;
	private static int costOfCourse = 600;
	private int tuitionBalance = 0;
	private static int id = 1000;
	private String balanceMessage;
	private int payment = 0;

	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = sc.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = sc.nextLine();

		System.out.print("1 - Freshmen\n2 - for Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();

		setStudentID();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

	}

	private void setStudentID() {

		id++;

		this.studentId = gradeYear + "" + id;

	}

	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();

			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {

				break;
			}

		} while (1 != 0);

		
	}

	public void viewBalance() {

		if(payment == 0) {
		balanceMessage = "Your balance is: $" + tuitionBalance;
		}

		else if (tuitionBalance == 0) {

			balanceMessage = "You don't have any balance left.";
		} else if(payment < tuitionBalance) {
			
			balanceMessage = "You have $" + tuitionBalance + " " + "balance left.";
		}

		System.out.println(balanceMessage);
	}

	public void payTuition() {

		do {
			viewBalance();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your payment: $");
			payment = sc.nextInt();

			if (payment > tuitionBalance) {

				System.out.println("Payment amount cannot be higher than the total balance.");

			} else {
				tuitionBalance = tuitionBalance - payment;

				System.out.println("Thank you for your payment of $" + payment);
				viewBalance();

				break;
			}
		} while (1 != 0);

	}
	
	public String showInfo() {
		
		return  "Student ID: " + studentId +
				"\nName: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
		
	}

}
