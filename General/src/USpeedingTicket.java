import java.io.*;
import java.util.*;
public class USpeedingTicket {
	
	static String file = "speeding";
	static Scanner in;
	static PrintWriter out;
	static ArrayList<Integer> a, b;
	static int n,m, max;


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
		m = in.nextInt();
		max = 0;
		
		a = new ArrayList<Integer>();
		b = new ArrayList<Integer>();
		
		
		
	}
	
	static void solve() {
		
		for(int i=0; i<n; i++) {
			
			int x = in.nextInt();
			int y = in.nextInt();
			
			for(int j = 0; j<x; j++) {
				
				a.add(y);
			}
		}
		
		for(int i = 0; i<m; i++) {
			
			int x = in.nextInt();
			int y = in.nextInt();
			
			for(int j = 0; j<x; j++) {
				b.add(y);
			}
		}
		
		for(int i = 0; i<100; i++) {
			
			if(a.get(i)<b.get(i)) max = Math.max(max, b.get(i) - a.get(i));
		}
		
		
		out.println(max);
	}

}
