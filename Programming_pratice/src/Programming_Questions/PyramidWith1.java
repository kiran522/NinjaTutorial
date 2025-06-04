package Programming_Questions;

import java.util.Scanner;

public class PyramidWith1 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int i,j;

    for (i=1;i<a+1;i++)
    {
        for(j=a-i;j>0;j--)
        {
            System.out.print(" ");
        }

        for(int k=0;k<2*i-1;k++)
        {
            System.out.print("1");
        }System.out.println();
    }
}}
