import java.util.Arrays;

public class Main {
     public static void main(String args[]) {
          int a1[] = { 2, 4, -1, 4, 8, 3, -1, 7, -1 };
          System.out.println("Before Shifting.....!");
          System.out.println(Arrays.toString(a1));
          int a2[] = new int[a1.length];
          int j = 0;
          for (int i = 0; i < a1.length; i++) {
               if (a1[i] < 0) {
                    a2[j] = a1[i];
                    j++;
               }
          }
          System.out.println("After Shifting Negative Values");
          System.out.println(Arrays.toString(a2));
          for (int i = 0; i < a1.length; i++) {
               if (a1[i] >= 0) {
                    a2[j] = a1[i];
                    j++;
               }
          }
          System.out.println("After Shifting All Values");
          System.out.println(Arrays.toString(a2));

     }
}
