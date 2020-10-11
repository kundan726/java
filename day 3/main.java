package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         int sub1;
         int sub2;
         int sub3;
         int sub4;
         int sub5;
         int total;
         float percentage;

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter The Marks of Subject 1 Out of 100");
         sub1=sc.nextInt();
//         System.out.println(sub1);

        System.out.println("Enter The Marks of Subject 2 Out of 100");
        sub2=sc.nextInt();
//        System.out.println(sub2);

        System.out.println("Enter The Marks of Subject 3 Out of 100");
        sub3=sc.nextInt();
//        System.out.println(sub3);

        System.out.println("Enter The Marks of Subject 4 Out of 100");
        sub4=sc.nextInt();
//        System.out.println(sub4);

        System.out.println("Enter The Marks of Subject 5 Out of 100");
        sub5=sc.nextInt();
//        System.out.println(sub5);

        total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("The total Marks is " + total);

        percentage=(total*100)/500;
        System.out.println("Percentage of student based on the marks is " + percentage);

        if (percentage>=90)
        {
            System.out.println("You have secured A grade");
        }
        else if(percentage>=75&&percentage<=89){
            System.out.println("You have secured B grade");
        }
        else if(percentage>=55&&percentage<=74){
            System.out.println("You have secured c grade");
        }
        else if(percentage>=45&&percentage<=55){
            System.out.println("You have secured D grade");
        }
        else{
            System.out.println("You have to study well");
        }

    }
}
