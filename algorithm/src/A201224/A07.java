package A201224;

import java.util.Scanner;

public class A07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int go = k;
		if (go < 10)
			go *= 10;
		int cnt = 0;
		while (k != go || cnt == 0) {
			int t = go / 10;
			int r = go % 10;
			int x = (t + r) % 10;
			int rx = r * 10 + x;
			if (rx == go) {
				cnt++;
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
