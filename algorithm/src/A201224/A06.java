package A201224;

import java.util.Scanner;

public class A06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (a == 0) {
				if (b == 0)
					break;
				System.out.println(a + b);
				continue;
			}
			System.out.println(a + b);
		}
	}
}
