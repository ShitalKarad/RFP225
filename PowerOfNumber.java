package com.brigelabz;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base");
        int base = sc.nextInt();
        System.out.println("Enter the Exponent");
        int exponent = sc.nextInt();
        long power = 1;
        int exp = exponent;
        while(exponent != 0){
            power = power * base;
            --exponent;
        }
        System.out.println(base + " to the power "+ exp + " is "+power);




    }
}
