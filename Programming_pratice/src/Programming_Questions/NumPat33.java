package Programming_Questions;

import java.util.Scanner;

public class NumPat33 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int num = 1;
        for(int i =1; i<=rows;i++)
        {

            for (int j=1; j<=i;j++)
            {
                System.out.print(num+" ");
                num++;


            }
            System.out.println("");
        }
    }
}
