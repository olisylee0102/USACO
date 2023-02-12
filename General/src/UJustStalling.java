import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class UJustStalling {
	
	static Scanner in;
	static int n;
	static long temp, ans;
	static long[] cows, lim, store;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		init();
		solve();
		

	}
	
	static void init() {
		
		n = in.nextInt();
		cows = new long[n];
		lim = new long[n];
		for(int i = 0; i<n; i++) {
			cows[i] = in.nextLong();
		}
		in.nextLine();
		for(int i = 0; i<n; i++) {
			lim[i] = in.nextLong();
		}
		
		Arrays.sort(cows);
		Arrays.sort(lim);
		
		store = new long[n];
	}
	
	static void solve() {
		
		
		
		/*for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<n; j++) {
				
				if(lim[i]>=cows[j]) store[i]++;
			}
		}
		
		ans = 1;
		for(int i = 0; i<n; i++) {
			ans*=store[i]-i;
		}
		
		System.out.println(ans);
		*/
		
		//System.out.println(Arrays.toString(store));
		
	}

}
