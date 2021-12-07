package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
	public static void main(String[] args) {
		// declare constant variable
		int IS_PRESENT = 1;
		// create object of random class
		Random rd = new Random();
		// generating number 0 or 1
		int empcheck =rd.nextInt(2);
		// applying condition for checking present or absent by using if statement
		if(empcheck==IS_PRESENT) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
