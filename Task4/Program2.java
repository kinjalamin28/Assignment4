package com.Task4;

public class Program2 {
    public static void main(String[] args) {
        InputArray a = new InputArray();
        a.addelement();
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i = 0; i < a.array.length; i++)
        {
            largest = Math.max(largest,a.array[i]);
        }
        for(int i = 0; i <a.array.length; i++)
        {
            if (a.array[i] != largest)
                second = Math.max(second, a.array[i]);
        }
        System.out.println("Second largest value is "+second);
    }
}
