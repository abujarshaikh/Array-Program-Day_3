//Write a java program to add element in starting position take input from user.

import java.util.Arrays;
import java.util.Scanner;

public class P3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of Array: ");
          int size = sc.nextInt();
          int[] a = new int[size];
          int[] a1 = new int[size + 1];
          for (int i = 0; i < a1.length; i++) {
               System.out.print("Enter Elements to insert at index " + i + " :");
               a[i] = sc.nextInt();
          }
          System.out.println(Arrays.toString(a));
          System.out.print("Enter Value to insert at First Position: ");
          int element = sc.nextInt();
          int position = 1;
          for (int i = size - 1; i < position - 1; i--) {
               a1[i + 1] = a[i];
          }
          a1[position - 1] = element;
          System.out.println(Arrays.toString(a1));
          sc.close();
     }
}
