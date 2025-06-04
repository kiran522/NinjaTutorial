package ReverseString;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String reverse_word="";
        for(int i=input.length()-1;i>-1;i--)
        {
            reverse_word+=input.charAt(i);
        }
        System.out.println(reverse_word);
    }
}
