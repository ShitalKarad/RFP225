package com.brigelabz;

public class FactorialNumber {
    public static void main(String args[]){
        int fact = 1, i = 1;
        int num = 10;
        for(i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " +num +" is "+fact);
    }
}
