package Programming_Questions;

import java.util.Scanner;

public class StrongNum {

    public static int Factorial(int num)
    {
        if((num==0)||(num==1))
        {
            return 1;
        }
        else
        {
            return num*Factorial(num-1);
        }
    }

    public static boolean isStrong(int n) {

        int Original = n;
        int Sum = 0;
        while (n != 0) {
            int temp = n % 10;
            Sum += Factorial(temp);
            n = n / 10;
        }
return Sum==Original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isStrong(a)) {
            System.out.println("This number is Strong number:- " + a);
        }
        else {
            System.out.println("This number is not a Strong number:- " + a);
        }
}}
