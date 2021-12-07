package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;

		Random rd = new Random();
		int empCheck = rd.nextInt(3);

		if(empCheck==IS_FULL_TIME) {
		    empHrs = 8;
		    System.out.println("Employee is Full Time");
		}
		else if(empCheck==IS_PART_TIME) {
		    empHrs = 4;
		    System.out.println("Employee is Part Time");
		}
		else {
		    System.out.println("Employee is Absent");
		}
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Daily Wage of Employee is: " + empWage);
	}
}
