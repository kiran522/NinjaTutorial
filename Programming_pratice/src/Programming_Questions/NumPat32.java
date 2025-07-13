package Programming_Questions;

import java.util.Scanner;

public class NumPat32 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i =1; i<=rows;i++)
        {
          int num = i;
            for (int j=1; j<=i;j++)
            {
                System.out.print(num+" ");
                num++;


            }
            System.out.println("");
        }
    }
}
