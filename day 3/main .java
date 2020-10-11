package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



         String name;
         int date;
         String month;
         int year;
         int age;
         int msalary;
         int totals;
         float tax;

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the employee ");
        name=sc.next();
//        System.out.println("The name of the Employee is "+ name \n);

        System.out.println("Enter the Month of Birth of the employee ");
        month=sc.next();
//        System.out.println("Month of Birth of the Employee is "+ month \n);

        System.out.println("Enter the year of Birth of the employee ");
        year=sc.nextInt();
//        System.out.println("Year of birth of the Employee is "+ year \n);

        System.out.println("Enter Monthly Salary  of the employee ");
        msalary=sc.nextInt();
//        System.out.println("Monthly salary  of the Employee is "+ msalary);

        totals=msalary*12;

        System.out.println("The name of the Employee is "+ name + "\n");
        System.out.println("Month of Birth of " + name + " is "+ month +"\n");
        System.out.println("Year of birth of " + name + " is " + year + "\n");
        age=2020-year;
        System.out.println(name + "'s age is " + age + "\n");
        System.out.println("Monthly salary of " + name + " is " + msalary + "\n");
        System.out.println("Annual Salary of " + name +" is " + totals +"\n");

        if (totals>=500000){
            tax=(20*totals)/100;
            System.out.println(name + " have to pay " + tax + " rupees in tax \n" );
        }
        else if(totals>=399999&&totals<=499999){
            tax=(15*totals)/100;
            System.out.println(name + " have to pay " + tax + " rupees in tax \n" );
        }
        else if(totals>299999&&totals<=399999){
            tax=(10*totals)/100;
            System.out.println(name + " have to pay " + tax + " rupees in tax \n"  );
        }
        else if(totals>=200000&&totals<=299999){
            tax=(5*totals)/100;
            System.out.println(name + " have to pay " + tax + " rupees in tax \n" );
        }



    }
}
