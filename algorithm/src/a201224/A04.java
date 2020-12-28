package a201224;

import java.util.Scanner;

public class A04 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int k = s.nextInt();
	    for (int i = 0; i < k; i++) {
	      for (int j = i; j < k - 1; j++)
	        System.out.print(" "); 
	      for (int q = 0; q < i + 1; q++)
	        System.out.print("*"); 
	      System.out.println();
	    } 
	  }
}
