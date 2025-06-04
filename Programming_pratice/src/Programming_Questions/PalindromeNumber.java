package Programming_Questions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reverseNum=0;
        while(a!=0){
           int digit = a%10;
             reverseNum = reverseNum*10+digit;
            a= a/10;


        } System.out.println("Reversed number: " + reverseNum);
    }
}
