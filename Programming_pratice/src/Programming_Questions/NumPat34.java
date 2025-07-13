package Programming_Questions;

import java.util.Scanner;

public class NumPat34 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int count=1;

        for (int i = rows; i>0; i--)
        {
            for (int j=i;j>0;j--)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println(" ");
        }
    }
}
