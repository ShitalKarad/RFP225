package day1problems;

import java.util.Scanner;

public class TwoStringEqualOrNot {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two String ");
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.length() == str2.length()){
            System.out.println("The given two Strings are equal ");
        }else{
            System.out.println("The given two Strings are not equal ");
        }
    }
}
