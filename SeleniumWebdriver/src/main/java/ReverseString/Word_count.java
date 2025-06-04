package ReverseString;

import java.util.Scanner;

public class Word_count {
    public static void main(String[] args) {
        System.out.println(" give input value");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

       String[] word= input.split("\\s+");
        System.out.println(word.length);

    }
}
