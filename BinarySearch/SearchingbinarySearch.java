package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {23,4,5,2,4,524,56,24,6};
	int target = 34;
	int ans = binarysearch(arr , target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {

       int start = 0;
       int end = arr.length -1;

       while (start < end)
       {
           int mid = start + end /2;

           if(target < arr[mid])
           {
               end = mid -1;
           }
           else if(target > arr[mid])
           {
               start = mid + 1;
           }
           else {
               return mid;
           }
       }
       return -1;

    }
}
