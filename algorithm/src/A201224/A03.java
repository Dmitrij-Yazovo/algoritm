package A201224;

import java.util.Scanner;

public class A03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		for (int i = 1; i < k + 1; i++) {
			System.out.print("*");
			for (int j = 1; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
