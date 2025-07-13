package Programming_Questions;

import java.util.Scanner;

public class NumPat14 {
    public static void main(String[] args) {
        System.out.println("the number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();

        for(int i =1; i<=rows;i++)
        {
            for (int j=rows-i; j>0;j--)
            {
                System.out.print(" ");
            }

            for (int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
