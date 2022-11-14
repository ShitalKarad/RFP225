package com.brigelabz;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit ");
        int val = sc.nextInt();
        if(val%2==0){
            System.out.println(val +" is a Even number");
        }else{
            System.out.println(val +" is a Odd number");
        }
    }
}
