import java.io.*;
import java.util.Scanner;
public class UFencePainting {
	
	static String file = "paint";
	static Scanner in;
	static PrintWriter out;
	static boolean[] fence;
	static int n1, n2, n3, n4, count;

	public static void main(String[] args) throws FileNotFoundException {
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		n4 = in.nextInt();
		
		fence = new boolean[101];
		
		
		
	}

	static void solve() {
		count = 0;
		
		for(int i = n1; i<n2; i++) {
			fence[i] = true;
		}
		
		for(int i = n3; i<n4; i++) {
			fence[i] = true;
		}
		
		for(int i = 0; i<101; i++) {
			if(fence[i]) count++;
		}
		
		out.println(count);
		

		
	}

}
