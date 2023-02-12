import java.io.*;
import java.util.Scanner;
public class UFeedingTheCows {
	
	static Scanner in;
	static int t, n, k, cnt, p;
	static String[] a;
	static char b[];
	

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		init();
		solve();
		
	}
	
	static void init() {
		
		t = in.nextInt(); in.nextLine();
		n = in.nextInt();
		k = in.nextInt();
		a = new String[n];
		a = in.nextLine().split("");
		b = new char[n];
		
		
		
	}
	
	static void solve() {
		
		cnt = 0;
		p = -k-1;
		
		for(int i = 0; i<n; i++) {
			if(a[i] == "G") {
				if(Math.abs(i-p)<=k) {
					continue;
				}
				
				p = Math.min(i+k,  n-1);
				b[p] = 'G';
				cnt++;
			} 
		}
		
		p = -k-1;
		
		for(int i = 0; i<n; i++) {
			if(a[i] == "H") {
				if(Math.abs(i-p)<=k) {
					continue;
				}
				
				p = Math.min(i+k,  n-1);
				
				if(b[p] != 'H') {
					p--;
				}
				b[p] = 'H';
				cnt++;
			} 
		}
		
		System.out.println(cnt);
		
			
		
		
	}

}
