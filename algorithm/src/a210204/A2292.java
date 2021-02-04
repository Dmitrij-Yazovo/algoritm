package a210204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2292 {
	public static void main(String[] args) throws IOException{
		
		// 계차수열 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		
		int start = 1;
		int cnt = 1;
		
		if(a == 1){
			System.out.println(a);
		} else {
			while(start<a) 
				start += 6*(cnt++);
			System.out.println(cnt);
		}
		
		
		
		
	}
}
