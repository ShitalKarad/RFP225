package com.brigelabz;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingScanner {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digits ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        for(int i=num1; i<=num2; i++){
            sum+=i;
            System.out.println(sum);
        }

    }
}
