package Programming_Questions;

import java.util.Scanner;

public class NumPat27 {
    public static void main(String[] args) {

        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i=1; i<=rows;i++)
        {
            for (int j=i;j<i+7;j++)
            {
                if(j%2==0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println("");
        }

    }
}
