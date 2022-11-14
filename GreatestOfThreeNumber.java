package com.brigelabz;

public class GreatestOfThreeNumber {
    public static void main(String arg[]) {
        int first = 10;
        int second = 30;
        int third = 20;
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        System.out.println(max + " is greater no");
    }
}
