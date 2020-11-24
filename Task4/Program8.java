package com.Task4;

import java.util.Arrays;

public class Program8 {
    private static int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;

            }

            nums[j++] = nums[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 10,10,20,20,20,30,40,40,40,50 };
        System.out.println("Array is :");
        System.out.println(Arrays.toString(nums));
        int newLength = removeDuplicates(nums);


        System.out.println("After removing duplicates Array length is "+newLength+"\n and array is :");
        for (int i =0;i<newLength;i++)
            System.out.print(nums[i]+" ");
    }
}
