package Programming_Questions;

import java.util.Scanner;

public class NumPat39 {
    public static void main(String[] args) {
        System.out.println("The number of rows will come 2*GivenNum");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int length=17;

        for(int i = 0; i <rows; i ++)
        {
            for (int j=0;j<length;j++)
            {
                int min= Math.min(j,length-1-j);
                int val= 9- Math.min(min,i);
                System.out.print(val);
            }
            System.out.println("");
        }

        for (int i=rows-2; i>=0;i--)
        {
            for(int j=0;j<length;j++)
            {
                int min= Math.min(j,length-1-j);
                int val= 9- Math.min(min,i);
                System.out.print(val);
            }System.out.println("");
        }
    }
}
