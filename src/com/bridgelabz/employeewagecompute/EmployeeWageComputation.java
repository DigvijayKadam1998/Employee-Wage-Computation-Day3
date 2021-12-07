package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		
		Random rd = new Random();
		int empCheck = rd.nextInt(2);
		
		if(empCheck==IS_FULL_TIME) {
		    empHrs=8;
		    System.out.println("Employee is Present");
		}
		else {
		    System.out.println("Employee is Absent");
		}
		empWage= WAGE_PER_HOUR * empHrs;
		System.out.println("Daily Wage of Employee is: " + empWage);
	}
}
