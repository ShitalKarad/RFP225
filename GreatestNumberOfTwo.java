package com.brigelabz;

import java.util.Scanner;

public class GreatestNumberOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        if(first>second){
            System.out.println("Greater number is "+first);
        }
        else if (first==second) {
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Greater number is "+second);
        }

    }
}
