package Programming_Questions;

import java.util.Scanner;

public class MaxNumWithoutCondition {
int Max1=0;
    public static int getMax(int n1, int n2)
    {
       int Max1= (n1+n2+Math.abs(n1-n2))/2;
       return Max1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getMax(a,b));
    }
}
