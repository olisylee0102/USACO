import java.io.*;
import java.util.Scanner;
public class UBovineShuffle {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int[] a, b, d;
	static int n;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		
		n = in.nextInt();in.nextLine();
		
		a = new int[n];
		
		d = new int[n];
		for(int  i = 0; i<n; i++) {
			d[in.nextInt()-1] = i;
			
			
		}
		in.nextLine();
		
		b = new int[n];
		for(int i = 0; i<n; i++) {
			b[i] = in.nextInt();
		}
		
	}
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			a[d[d[d[i]]]] = b[i];
		}
		
		out.println(a);

	}

}
