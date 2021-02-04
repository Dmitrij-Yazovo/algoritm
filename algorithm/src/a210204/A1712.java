package a210204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1712 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());
		
        
		if(c<=b) {
			System.out.println(-1);
			return;
		} else {
			System.out.println(((int)a/(c-b))+1);
		}
		
	
	}
	
	
}
