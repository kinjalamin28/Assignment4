package com.Task4;

public class Program10 {
    public static void main(String[] args) {
        InputArray a = new InputArray();
        a.addelement();

        int x =0;
        int y =1;
        int sum;
        int minsum =a.array[0]+a.array[1];

        for (int i =0;i<a.array.length-1;i++ )
        {
            for(int j =i+1;j<a.array.length;j++) {
                sum = a.array[i] + a.array[j];
                if (Math.abs(minsum)<Math.abs(sum));
                {
                    minsum=sum;
                    x=i;
                    y=j;
                }
            }

        }
        System.out.println("two elements whose sum is less than others are "+a.array[x]+" and "+a.array[y]);
    }
}
