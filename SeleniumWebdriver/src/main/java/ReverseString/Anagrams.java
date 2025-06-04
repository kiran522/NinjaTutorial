package ReverseString;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in1= sc.next().toLowerCase();
        String in2= sc.next().toLowerCase();

        if(in1.length()!=in2.length())
        {
            System.out.println("it is not anagram");
        }

         char[] arr1= in1.toCharArray();
        char[] arr2 =in2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       if( Arrays.equals(arr1,arr2))
        {
            System.out.println(" anagram");
        }
        else
        {
            System.out.println("no anagram");
        }

    }
}
