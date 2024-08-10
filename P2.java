//WAJP to print program in firstandlast format in array.

import java.util.Scanner;

class P2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of Array: ");
          int size = sc.nextInt();
          if (size % 2 == 0) {
               System.out.println("Enter Elements of Array....");
               // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
               int a[] = new int[size];
               for (int i = 0; i < size; i++) {
                    a[i] = sc.nextInt();
               }
               int x = 0;
               // System.out.println(a.length);
               int y = size - 1;
               System.out.println("Array in ");
               for (int i = 0; i < a.length / 2; i++) {
                    System.out.print(a[x++] + " ");
                    System.out.print(a[y--] + " ");
               }
          } else {
               System.out.println("Enter Elements of Array....");
               // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
               int a[] = new int[size];
               for (int i = 0; i < size; i++) {
                    a[i] = sc.nextInt();
               }
               int x = 0;
               // System.out.println(a.length);
               int y = size - 1;
               System.out.println("Array in ");
               for (int i = 0; i < (size + 1) / 2; i++) {
                    if (x == y) {
                         System.out.print(a[x] + " ");
                         break;
                    } else {
                         System.out.print(a[x++] + " ");
                         System.out.print(a[y--] + " ");
                    }
               }
          }
          sc.close();
     }
}