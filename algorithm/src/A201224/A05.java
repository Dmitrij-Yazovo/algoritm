package A201224;

import java.util.Scanner;

public class A05 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int x = s.nextInt();
	    int[] a = new int[n];
	    for (int i = 0; i < a.length; i++) {
	      int y = s.nextInt();
	      a[i] = y;
	      if (a[i] < x)
	        System.out.print(String.valueOf(a[i]) + " "); 
	    } 
	    s.close();
	  }
}
