package Programming_Questions;

import java.util.Scanner;

public class NumPat42 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows  = sc.nextInt();

        for(int i =rows;i>0;i--)
        {
            for (int j=i;j>0;j--)
            {
                if(i==j || i==rows || j==rows-i-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }

            }System.out.println("");
        }
    }
}
