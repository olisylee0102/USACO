import java.io.*;
import java.util.Scanner;
public class UMooOperations {
	static Scanner in;
	static int n, min, cnt, len;
	static String s;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		init();
		solve();
		


	}
	
	static void init() {
		n = in.nextInt(); in.nextLine();
		
	}
	
	static void solve() {
	
		
		for(int i = 0; i<n; i++) {
			min = Integer.MAX_VALUE;
			cnt = 0;
			s = in.nextLine(); 
			
			len = s.length();
			
			
			if(s.contains("MOO")) {
				cnt = len-3;
				min = Math.min(min,  cnt);
			}
			
			else if(s.contains("OOO")||s.contains("MOM")) {
				cnt = len-2;
				min = Math.min(cnt,  min);
			
			}else if(s.contains("OOM")) {
				cnt = len-1;
				min = Math.min(cnt,  min);
			
			}else {
				cnt = -1;
				min = Math.min(min,  cnt);
			}
			
			System.out.println(min);
		}
			
		
	
	
	}

}
