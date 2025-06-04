package Programming_Questions;

import java.util.Scanner;

public class PrimeOrNonPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        for(int i=1; i < a; i++)
        {
           if(a%i==0){
               count++;
           }
        }
        if(count>1)
        {
            System.out.println("the number is NonPrime");
        }
        else {
            System.out.println("the number is Prime");
        }sc.close();
    }
}
