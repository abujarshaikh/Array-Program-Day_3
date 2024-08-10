// Write a java program to delete an element from array and also shift the element take input from user.

import java.util.Arrays;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();

        int[] a = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Elements of An Array: " + Arrays.toString(a));
        System.out.print("Enter the index of the element to delete: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            size--;

            System.out.println("Element deleted successfully.");
            System.out.println("Updated Array:");
            for (int i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}
