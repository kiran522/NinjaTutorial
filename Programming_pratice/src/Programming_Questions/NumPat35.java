package Programming_Questions;

import java.util.Scanner;

public class NumPat35 {
    public static void main(String[] args) {
        System.out.println("The number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int num=0;

        for (int i=1 ; i <=rows; i++)
        {
            int[] arr = new int[i];

            for (int j= 0; j<i;j++)
            {
                arr[j]= num++;
            }

            if(i%2==0)
            {
                for (int j=i-1;j>=0;j--)
                {
                    System.out.print(arr[j]+" ");
                }
            }
            else
            {
                for (int j=0;j<i;j++)
                {
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println(" ");

        }




    }
}
