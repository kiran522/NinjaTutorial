package ReverseString;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1= sc.next();

        String reverse="";

        for(int i=input1.length()-1;i>-1;i--)
        {
            reverse+=input1.charAt(i);
        }
       if( reverse.equals(input1))
       {
           System.out.println("This is palindrome");
       }
       else {
           System.out.println("This is not palindrome");
       }
    }
}
