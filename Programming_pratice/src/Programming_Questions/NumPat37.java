package Programming_Questions;

import java.util.Scanner;

public class NumPat37 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();

        for (int i =1; i<=rows;i++)
        {
            for (int j= 1;j<=i*2-1;j++)
            {
                if(j%2==0)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println("");
        }
    }
}
