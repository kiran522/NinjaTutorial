package Programming_Questions;

import java.util.Scanner;

public class NumPat8 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();

        for (int i=rows; i>0;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
