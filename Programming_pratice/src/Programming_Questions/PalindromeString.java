package Programming_Questions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse="";
        for(int i=str.length()-1; i>-1;i--)
        {
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("the string is palindrome");
        }
        else {
            System.out.println("the string is not palindrome");
        }
    }
}
