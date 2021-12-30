package com.bridgelabz.employeewage1;

public class EmployeeWage1 {

    private static int IS_PART_TIME = 1;
    private static int IS_FULL_TIME = 2;
    private static int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {

        int empCheck =(int) Math.floor(Math.random() *10 )%3;

        int empWage = 0;
        int empHrs = 0;

        if ( empCheck == IS_PART_TIME ) {
            empHrs = 4;
        } else if ( empCheck == IS_FULL_TIME ) {
            empHrs = 8;
        }else {
            empHrs=0;


        }

        empWage = empHrs * EMP_RATE_PER_HOUR ;
        System.out.println("Employee Wage : "+empWage);
    }
}
