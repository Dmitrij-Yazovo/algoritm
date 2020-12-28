// 제출양식


import java.io.IOException;
import java.util.Scanner;

public class Main {
	//
	//
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			int x = s.nextInt();
			arr[i] = x % 42;
		}

		for (int i = 0; i < 10; i++) { 
			int ct = 0;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) { 
					ct++;
				}
			}
			if (ct == 0) { 
				cnt++;
			}
		}

		s.close();
		System.out.println(cnt);
	}
    
    //
    //
}