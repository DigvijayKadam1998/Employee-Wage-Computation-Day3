package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
	public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;
        public static final int WAGE_PER_HR =20;
	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;

		Random rd = new Random();
		int empCheck = rd.nextInt(3);

		switch(empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				System.out.println("Employee is Full Time");
				break;
			case IS_PART_TIME:
				empHrs = 4;
				System.out.println("Employee is Part Time");
				break;
			default:
				empHrs = 0;
				System.out.println("Employee is Absent");
				break;
		}
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Daily Wage of Employee is: " + empWage);
	}
}
