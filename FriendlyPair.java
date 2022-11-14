package com.brigelabz;

public class FriendlyPair {
    public static void main(String arg[]){
        int num1=30;
        int num2=140;
        int sum1=DivisionSum(num1);
        int sum2=DivisionSum(num2);

        if(sum1 / num1 == sum2 / num2)
            System.out.println (num1 + " & " + num2 + " are friendly pairs");
     else
            System.out.println (num1 + " & " + num2 + " are not friendly pairs");
    }
        static int DivisionSum(int num){
            int sum=0;
            for(int a = 1; a < num; a++){
                if (num%a == 0)
                    sum = sum + a;
            }
                return num;
            }
        }

