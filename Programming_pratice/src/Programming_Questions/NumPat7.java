package Programming_Questions;

import java.util.Scanner;

public class NumPat7 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();

        for (int i =1;i< rows;i++)
        {
            for (int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
