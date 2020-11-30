package com.Task4;

public class Program7 {
    public static void main(String[] args) {
        InputArray a = new InputArray();
        a.addelement();

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        for (int i=0;i<a.array.length;i++)
        {
            small= Math.min(small,a.array[i]);
            large = Math.max(large,a.array[i]);
        }
        System.out.println("Difference between largest and smallest number is "+(large-small));


    }
}
