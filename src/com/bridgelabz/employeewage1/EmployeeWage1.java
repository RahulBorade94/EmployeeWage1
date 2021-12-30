package com.bridgelabz.employeewage1;

public class EmployeeWage1 {
    private static int WAGE_PER_HOUR = 20;
    private static int IS_PART_TIME = 1;
    private static int IS_FULL_TIME = 2;
    public static void main(String[] args) {

        int empCheck =(int) Math.floor(Math.random() *10 )%3;

        int empWage = 0;
        int empHrs = 8;

        if ( empCheck == IS_PART_TIME ) {
            empHrs = 4;
        } else if ( empCheck == IS_FULL_TIME ) {
            empHrs = 8;
        }else {
            System.out.println("Employee is Absent");

        }
        empWage = WAGE_PER_HOUR * empHrs ;
        System.out.println("Employee Wage : "+empWage);
    }
}
