import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;

public class UCowGymnastics {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int k, n;
	static int[][] a;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		k = in.nextInt();
		n = in.nextInt();
		
		a = new int[k][n];
		
		for(int i = 0; i<k; i++) {
			for(int j = 0; j<n; j++) {
				a[i][in.nextInt()-1] = j;
			}
		}
		
		
	}
	
	static void solve() {
		
		int ans = 0;
		
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				
				int win = 0;
				
				for(int m = 0; m<k; m++) {
					if(a[m][i] < a[m][j]) {
						win++;
					}
				}
				
				if( win==k||win==0) ans++;
			}
		}
		
		out.println(ans);
		
	}

}
