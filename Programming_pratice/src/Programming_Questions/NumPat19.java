package Programming_Questions;

import java.util.Scanner;

public class NumPat19 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i =1; i <= rows; i++)
        {
            for (int j =rows-i; j>0; j--)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i; j++)
            {
                System.out.print(i+" ");

            }
            System.out.println(" ");
        }
    }
}
