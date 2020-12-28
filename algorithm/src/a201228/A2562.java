package a201228;

import java.util.Scanner;

public class A2562 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] a = new int[9];
    int max = 0;
    int w = 0;
    for (int i = 0; i < 9; i++) {
      a[i] = s.nextInt();
      if (a[i] > max) {
        max = a[i];
        w = i + 1;
      } 
    } 
    s.close();
    System.out.println(max);
    System.out.println(w);
  }
}
