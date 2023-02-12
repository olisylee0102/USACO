import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class UBucketList {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n, s, e, b;
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
		a = new int[1001];
	}
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			s = in.nextInt();
			e = in.nextInt();
			b = in.nextInt();
			
			for(int j = 0; j<=e; j++) {
				
				a[j]+=b;
				
			}
		}
		
		Arrays.sort(a);
		
		out.println(a[1000]);
		
		
	}

}
