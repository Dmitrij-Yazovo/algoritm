package a201230;

import java.util.Scanner;

public class A10870 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		
		int res = fibo(num);
		System.out.println(res);
	}

	public static int fibo(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
}