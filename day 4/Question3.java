package com.letsupgrade;;

import java.util.Scanner;

public class Question3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter integer #" +(i+1) + " :  ");
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of array elements is " + sum);
    }

}
