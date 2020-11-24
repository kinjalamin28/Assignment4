package com.Task4;

import java.util.Arrays;

public class Program11 {
    public static void main(String[] args) {
        int n[] = new int[]{1,2,3,4,5,6,7,8,9,10};


        System.out.println("Original Array ");
        System.out.println(Arrays.toString(n));

        int result[] = new int[10];

        int min = 0, max = 9;
        boolean flag = true;

        for (int i = 0; i < 10; i++) {
            if (flag)
                result[i] = n[max--];
            else
                result[i] = n[min++];

            flag = !flag;
        }
        System.out.println(Arrays.toString(result));
    }
}
