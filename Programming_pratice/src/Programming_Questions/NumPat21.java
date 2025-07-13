package Programming_Questions;

import java.util.Scanner;

public class NumPat21 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i =0; i <= rows-1; i++)
        {
            for (int j =rows-i; j>0; j--)
            {
                System.out.print(" ");
            }

            for(int j=rows-i;j<=rows; j++)
            {
                System.out.print(j+" ");

            }
            System.out.println(" ");
        }
    }
}
