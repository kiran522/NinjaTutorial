package Programming_Questions;

import java.util.Scanner;

public class NumPat4 {
    public static void main(String[] args) {
        System.out.println("The number  of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i= rows; i>0;i--)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
