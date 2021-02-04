package a210204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1193 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int range = 0; // 시작
		int cnt = 1; // 대각 출 카운터
		int tmp = range + cnt; // 대각을 벗어났을때 지나온 갯수

		while (true) {
			if (x <= tmp) { // 입력반은 수가 범위안에 들어갓을 경우
				break;
			}
			range += cnt; // 지금까지 지나온 갯수 저장
			cnt++; // 다음줄로 이동
			tmp = range + cnt;
		}
		int k = x - range;
		if (cnt % 2 == 1) { // 홀수번째 줄이면 우상향
			System.out.println((cnt - (k - 1)) + "/" + (k));
		} else { // 짝수줄이면 좌하향
			System.out.println((k) + "/" + (cnt - (k - 1)));
		}
		
		
	}

}
