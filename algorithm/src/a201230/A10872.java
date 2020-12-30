package a201230;

import java.util.Scanner;

public class A10872 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		
		long sum = factorial(num);
		System.out.println(sum);
	}

	public static long factorial(int n) {
		if(n <= 1)
			return 1;
		return n*factorial(n-1);
	}
}