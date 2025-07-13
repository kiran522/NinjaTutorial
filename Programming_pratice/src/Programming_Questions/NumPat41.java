package Programming_Questions;

import java.util.Scanner;

public class NumPat41 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows  = sc.nextInt();

        for(int i=rows;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                if(j==1 || j==i || i==rows)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }System.out.println("");
        }


    }
}
