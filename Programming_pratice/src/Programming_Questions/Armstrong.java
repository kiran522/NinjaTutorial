package Programming_Questions;

import java.util.Scanner;

public class Armstrong {

    public static boolean find_armstrong(int a){
        int originalNumber = a;
        int sum=0;
        int CharInDigit =String.valueOf(originalNumber).length();

        for(int i =0; i< CharInDigit;i++)
        {
int digit= a%10;
sum+= Math.pow(digit,CharInDigit);
a/=10;
        }

        return  sum==originalNumber;
    }

    public static void main(String[] args) {
        Scanner  sc =  new Scanner(System.in);
        int Num = sc.nextInt();

        if(find_armstrong(Num)){
            System.out.println("this is armstrong number");
        }
        else {
            System.out.println("this is not a armstrong number");
        }
    }
}
