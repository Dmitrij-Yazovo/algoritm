package a210121;

import java.util.Scanner;

public class A11720 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		int k = s.nextInt();
		int arr[] = new int[k];
		String str = s.next();
		for(int i = 0; i<arr.length;i++) {
			int zz = str.charAt(i)-48;
			arr[i] = zz;
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
