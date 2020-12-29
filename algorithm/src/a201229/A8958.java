package a201229;

import java.util.Scanner;

public class A8958 {
	public static void main(String[] args) {
		// o79 x88 --> ascii 안됨 .charAt() 으로 스트링의 문자를 추출하여 o인지x인지 확인하는것으로
		Scanner s = new Scanner(System.in);

		String arr[] = new String[s.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextLine();
		}

		s.close();

		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int total = 0;

			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(i) == 'O') { 	// 이부분을 .charAt()
					cnt++;
				} else {
					cnt = 0;
				}
				total += cnt;
			}

			System.out.println(total);

		}
	}
}
