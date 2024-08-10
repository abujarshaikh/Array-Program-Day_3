// write a java program to rotate the array to the right n number of time take input from user.
import java.util.Arrays;
import java.util.Scanner;

public class P6 {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the size of the array: ");
          int size = scanner.nextInt();

          int[] array = new int[size];

          System.out.println("Enter " + size + " elements:");
          for (int i = 0; i < size; i++) {
               array[i] = scanner.nextInt();
          }

          System.out.print("Enter the number of times to rotate: ");
          int rotations = scanner.nextInt();

          System.out.println("========================================");
          System.out.println("Original array:\t " + Arrays.toString(array));
          System.out.println("========================================");

          // Rotate the array to the right by the specified number of times
          for (int i = 0; i < rotations; i++) {
               int temp = array[size - 1];
               for (int j = size - 1; j > 0; j--) {
                    array[j] = array[j - 1];
               }
               array[0] = temp;

               // System.out.println("Rotation " + (i + 1) + ":");
               System.out.println("Rotation " + (i + 1) + ":\t" + Arrays.toString(array));
               System.out.println("========================================");
          }

          scanner.close();
     }

     // public static void printArray(int[] array) {
     // for (int i = 0; i < array.length; i++) {
     // System.out.print(array[i] + " ");
     // }
     // System.out.println();
     // }
}
