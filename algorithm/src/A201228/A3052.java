package A201228;

import java.util.Scanner;

public class A3052 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			int x = s.nextInt();
			arr[i] = x % 42;
		}

		for (int i = 0; i < 10; i++) { // 10개중 중복값이 있는지 검증하는 부분
			int ct = 0;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) { // 순차로 진행된 j 부터 같은값을 찾는다.
					ct++;
				}
			}
			if (ct == 0) { // 같은값이 없을때만 숫자를 더해준다.
				cnt++;
			}
		}

		s.close();
		System.out.println(cnt);
	}
}
