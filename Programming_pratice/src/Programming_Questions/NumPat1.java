package Programming_Questions;

import java.util.Scanner;

public class NumPat1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i=1;i<=rows;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
