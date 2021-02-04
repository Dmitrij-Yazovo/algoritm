package a201230;

import java.util.Scanner;

public class ssss {
	static char arr[][];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		arr = new char[x][x];

		star(0, 0, x, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	public static void star(int a, int b, int k, boolean rrr) {
		if (rrr) {
			for (int i = a; i < a + k; i++) {
				for (int j = b; j < b + k; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		if (k == 1) {
			arr[a][b] = '*';
			return;
		}

		int tmp = k / 3;
		int cnt = 0;
		for (int i = a; i < a + k; i += tmp) {
			for (int j = b; j < b + k; j += tmp) {
				cnt++;
				if (cnt == 5) {
					star(i, j, tmp, true);
				} else {
					star(i, j, tmp, false);
				}
			}
		}

	}

}
