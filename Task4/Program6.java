package com.Task4;

import java.util.Arrays;

public class Program6 {
    private static int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                nums[i]=0;
                continue;

            }

            nums[j++] = nums[i];
            nums[i]=0;
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 10,10,20,20,20,30,40,40,40,50 };
        System.out.println("Array is :");
        System.out.println(Arrays.toString(nums));
        int newLength = removeDuplicates(nums);


        System.out.println("After removing duplicates Array is :");
        System.out.println(Arrays.toString(nums));
        System.out.println();
    }
}

