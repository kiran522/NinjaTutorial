package Programming_Questions;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result=0;
        int sum=0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(num != sum ? "The number is not a perfect number" : "The number is a perfect number");
    }
}
