package a201230;

import java.util.Scanner;

public class A4344 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcase = s.nextInt();
		
		for(int i=0;i<testcase;i++){
			int numOfStudent = s.nextInt();
			double[] arr = new double[numOfStudent];
			double total = 0;
			
			for(int j = 0;j<arr.length;j++) {
				int x = s.nextInt();
				arr[j] = (double)x;
				total += arr[j];
			}
			
			double avg = (double)total/arr.length;
			int save = 0;
			for(int k = 0;k<arr.length;k++) {
				if(arr[k]>avg) {
					save++;
				}
			}
			double result = ((double)save/numOfStudent) * 100.0;
			System.out.print(String.format("%.3f", result));
			System.out.println("%");
		}
		
		s.close();
	}
}
