package com.Task4;

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        InputArray a = new InputArray();
        a.addelement();
        int i=0;

        for(int j = 0, l = a.array.length; j < l;) {
            if (a.array[j] == 0)
                j++;
            else {
                int temp = a.array[i];
                a.array[i] = a.array[j];
                a.array[j] = temp;
                i++;
                j++;
            }
        }
            while (i < a.array.length)
                a.array[i++] = 0;
            System.out.print("\nAfter moving 0's to the end of the array: \n");
        System.out.println(Arrays.toString(a.array));
        }
    }
