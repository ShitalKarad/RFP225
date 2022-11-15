package com.brigelabz;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num +" is Positive Number");

        }else{
            System.out.println(num +"  is Negative Number");
        }
    }
}