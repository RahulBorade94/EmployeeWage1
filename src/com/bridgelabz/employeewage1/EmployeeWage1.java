package com.bridgelabz.employeewage1;

public class EmployeeWage1 {
    public static void main(String[] args) {
        int IS_PRESENT =1;
        int empCheck =(int)Math.floor(Math.random() *10 )%2;
        if(empCheck == IS_PRESENT)
            System.out.println("Employee is Prsent");
        else
            System.out.println("Employee is Absent");
    }
}
