package Programming_Questions;

import java.util.Scanner;

public class NumPat15 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();

        for(int i =0;i<rows;i++ )
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=rows-i;j>0;j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
