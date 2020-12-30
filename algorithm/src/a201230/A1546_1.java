package a201230;

import java.util.Scanner;

public class A1546_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double[] a = new double[n];
		double max = 0.0;
		double total = 0.0;
		
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
			if(a[i]>max)
				max = a[i];
		}
		
		
		double[] aNew = new double[n];
		for(int i = 0; i<aNew.length;i++) {
			aNew[i] = (a[i]/max)*100.0;
			total += aNew[i];
		}


		double avg = (double)total/n;
		System.out.println(avg);
		
		
	}
}
