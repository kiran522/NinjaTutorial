package Programming_Questions;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener the index number");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int temp=0;
        System.out.println("Ener the value for each index number");
        for (int i=0; i<a;i++)
        {
            arr[i]= sc.nextInt();
        }


        for(int j=0; j< a/2;j++)
        {
            temp = arr[j];
            arr[j] = arr[a-j-1];
            arr[a-j-1]=temp;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
