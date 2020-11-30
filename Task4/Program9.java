package com.Task4;

public class Program9 {
    public static void main(String[] args) {
        InputArray a = new InputArray();
        a.addelement();
        int sum=6;
        System.out.println("Pairs having sum equal to given integer");
        for (int i = 0; i < a.array.length; i++)
            for (int j = i + 1; j < a.array.length; j++)
                if ((a.array[i] + a.array[j]) == sum)
                    System.out.println("["+a.array[i]+" , "+a.array[j]+"]");



    }
}
