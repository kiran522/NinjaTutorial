package Programming_Questions;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a % 2 == 0) {
            System.out.println("this is even" + a);
        } else {
            System.out.println("this is odd" + a);
        }
    }
}
