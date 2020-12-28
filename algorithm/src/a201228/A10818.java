package a201228;

import java.util.Scanner;

public class A10818 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int max = 0, min = 10000000;
    int[] a = new int[num];
    for (int i = 0; i < a.length; i++) {
      int x = s.nextInt();
      a[i] = x;
      if (a[i] > max)
        max = a[i]; 
      if (a[i] < min)
        min = a[i]; 
    } 
    System.out.println(min);
    System.out.println(max);
  }
}
