package com.day3_Array_Handling;

public class DuplicateElementOfArray {
    public static void main(String[] args){
            System.out.println("Duplicate numbers are ");
            int[] arr ={11,12,8,3,3,2,5,7,8,8,7,5,8,8,11,11,3,3};

            for(int i = 0;i<arr.length;i++){
                int temp=0;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j])
                        temp++;
                }
                if (temp==1){
                  System.out.println(arr[i]);


                }
            }
        }
    }

