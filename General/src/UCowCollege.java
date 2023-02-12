import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class UCowCollege {
	
	static Scanner in;
	
	static long[] t;
	static long n;

	static long ans, tuition;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(System.in);
		
		init();
		solve();
		
		
	}
	
	static void init() {
		
		n = in.nextInt(); in.nextLine();
		
		t = new long[(int) n];
		
		for(int i = 0; i<n; i++) {
			t[i] = in.nextInt();
		}
		
	}
	
	static void solve() {
		
		Arrays.sort(t);
		
		
		ans = 0;
		
		for(long i = 0; i<n; i++) {
			ans = Math.max(ans,  t[(int) i] * (n-i));
		}
		
		tuition = t[(int) (n-1)];
		for(int i = 0; i<n; i++) {
			if(t[i] * (n-i)==ans) tuition = Math.min(tuition, t[i]);
		}
		
		System.out.print(ans + " ");
		System.out.print(tuition);
		
		/*for(int i = 1; i<=max; i++) {
			
			count = 0;
			
			for(int j = 0; j<n; j++) {			
				if(t[j]>=i) count++;	
				
			}
			
			ans = Math.max(ans,  count * i);
			
			
		}
		
		tuition = max;
		
		for(int i = 1; i<=max; i++) {
			
			count = 0;
			
			for(int j = 0; j<n; j++) {
				if(t[j]>=i) count++;
				
				
			}
			
			if(count * i == ans) tuition = Math.min(tuition,  i);
			
			
		}
		
		
		
		
		
		
		System.out.print(ans + " ");
		System.out.print(tuition);
				
		
		*/
		
		
	
	}
		
			

}
