import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class UAngryCows {
	
	static String file = "angry";
	static Scanner in;
	static PrintWriter out;
	static int n, ans;
	static int[] a;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();



	}
	
	static void init() {
		
		n = in.nextInt();
		a = new int[n];
		
		for(int i = 0; i<n ;i++) a[i] = in.nextInt();
		Arrays.sort(a);
		ans = 0;
		
	}
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			int _ans = check(i, 1) + check(i, -1);
			
			
			ans = Math.max(ans,  _ans);
		}
		
		out.println(ans + 1);
	}
	
	static int check(int cur, int d) {
		
		int pow = 1;
		int cnt = 0;
		
		while(cur<n) {
			int next = cur;
			
			while(true) {
				if(next+d>=n || next+d<0 || Math.abs(a[next+d] - a[cur])>pow) break;
				next +=d;
				cnt++;
			}
			
			if(cur==next) break;
			cur = next;
			pow++;
		}
		
		return cnt;
	}

}
