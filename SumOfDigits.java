package com.brigelabz;

public class SumOfDigits {
    public static void main(String[] args){
        int l = 24567;
        int add = 0;
        while(l!=0){
            add+=(l%10);
            l=l/10;
        }
        System.out.println("Sum of digits is "+add);

    }
}
