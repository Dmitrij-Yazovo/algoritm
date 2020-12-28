package a201224;

import java.util.Scanner;

public class A02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		for (int i = 1; i <= k; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println("Case #" + i + ": " + (x + y));
		}
		in.close();
	}
}
