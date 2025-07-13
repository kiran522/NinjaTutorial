package Programming_Questions;

import java.util.Scanner;

public class Numpat30 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();


        for(int i =0; i<rows;i++)
        {
            for(int j=0;j<rows;j++)
            {
                if(i==j)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print("0");
                }

            }  System.out.println("");
        }
    }
}
