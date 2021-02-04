package a210121;

import java.util.Scanner;

public class A2675 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int cnt = s.nextInt();
		String str = s.next();
		int aa = cnt * str.length();
		String result = null;
		
		for (int i = 0; i < aa; i++) {
			result += str.charAt(i);
		}
		
		
		
		System.out.println(result);

	}
}
