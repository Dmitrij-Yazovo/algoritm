package a201228;

import java.util.Scanner;

public class A2577 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int num = a * b * c;
    s.close();
    int[] arr = new int[10];
    while (num > 0) {
      arr[num % 10] = arr[num % 10] + 1;
      num /= 10;
    } 
    for (int i = 0; i < arr.length; i++)
      System.out.println(arr[i]); 
  }
}
