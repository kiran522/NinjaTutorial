package Programming_Questions;

import java.util.Scanner;

public class NumPat12 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i=rows-1; i>0;i--)
        {
            for (int j=i;j>0;j--)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=rows-i;j++)
            {
                System.out.print(j);
            }System.out.println("");
        }
    }
}
