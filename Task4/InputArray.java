package com.Task4;

import java.util.Scanner;

public class InputArray {
    int array[]=new int[5];
    Scanner input = new Scanner(System.in);

    void addelement()
    {
        for (int i =0;i<array.length;i++)
        {
            System.out.print("add element :");
            array[i]= input.nextInt();

        }
    }
}
