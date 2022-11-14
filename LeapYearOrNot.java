package com.brigelabz;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year ");
        int year = sc.nextInt();
        if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("THe year is a Leap year "+year);
        }else{
            System.out.println("The year is not a leap year "+year);
        }
    }
}
