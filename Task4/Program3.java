package com.Task4;

public class Program3 {
    public static void main(String[] args) {
        InputArray a = new InputArray();
        a.addelement();
        int smallest=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i = 0; i < a.array.length; i++)
        {
            smallest = Math.min(smallest,a.array[i]);
        }
        for(int i = 0; i <a.array.length; i++)
        {
            if (a.array[i] != smallest)
                second = Math.min(second, a.array[i]);
        }
        System.out.println("Second smallest value is "+second);
    }
    }

