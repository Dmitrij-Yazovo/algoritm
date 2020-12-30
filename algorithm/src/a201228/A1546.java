package a201228;

import java.util.Scanner;

public class A1546 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int max = 0;
		int total = 0;
		
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
			if(a[i]>max)
				max = a[i];
		}
		
		
		int[] aNew = new int[n];
		for(int i = 0; i<aNew.length;i++) {
			aNew[i] = (a[i]/max)*100;
			total += aNew[i];
		}


		double avg = (double)total/n;
		System.out.println(avg);
		
		
	}
}
