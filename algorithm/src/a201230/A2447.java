//풀이중 (2020/12/30 ~ )

package a201230;

import java.util.Scanner;

public class A2447 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k =s.nextInt();
		
		star(k);
	}
	public static void star(int n) {
		if(n<=1) {
			int[][] arr;
			arr = new int[3][3];
			for(int i = 0;;i++) {
				
			}
			
		}
		
	
		
//		if(n <= 1) {
//			System.out.println("***");
//			System.out.println("* *");
//			System.out.println("***");
//		}
//		star(n-1);
	}
}



/*
	
	1230 - 현재 아이디어. 2차원 배열을 3 by 3 으로 선언하면 
	
	1 2 3
	4 5 6
	7 8 9
	
	이렇게 생길것. 각 방당(1번 2번 3번 4번 ...) 다시 3by3을 호출 - 재귀
	마지막에서 5번방을 제외하고 *을 출력하도록 할 생각
	
	그렇다면 입력이 27과 같이 주어지면 어떻게 처리해야하나?
	
	카운터를 선언해서 27을 계속 3으로 나누어 한 번 나눌때마다 1 증가. 몫이 1이 될때까지 반복
	 ㄴ--> 카운터는 지수가 된다.
			그러면 첫째 라인에 3^3 개의 별 필요 -- 쉬프트연산을 활용할 생각해보기
	
	전체 필요한 공간 - 입력받은 n*n칸
	
		0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26   
		 
	0	1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
	1	28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54
	2	55  ...																	   80 81
	3	82  ...
	4	.
	5
	

*/

