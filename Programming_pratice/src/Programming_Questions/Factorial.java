package Programming_Questions;

import java.util.Scanner;

public class Factorial {
    public static int factorialNum(int num)
    {
        if((num ==0) || (num==1))
        {
            return 1;
        }
        else
        {
            return num * factorialNum(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the factorial of the number is "+factorialNum(a));
    }
}
