import java.io.*;
import java.util.Scanner;

public class UStuckInARut {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n;
	static char[] d;
	static int[] x, y;

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
		d = new char[n];
		x = new int[n];
		y = new int[n];
		
		for(int i = 0; i<n; i++) {
			d[i] = in.next().charAt(0);
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
	}
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			int answer = check(i);
			if(answer==Integer.MAX_VALUE) out.println("Infinity");
			else out.println(answer);
		}
		
	}
	
	static int check(int i) {
		
		int min = Integer.MAX_VALUE;
		
		for(int j = 0; j<n; j++) {
			
			if(i == j) continue; //intersection
			if(d[i] == d[j]) continue; //parallel
			
			int dx = Math.abs(x[j] - x[i]);
			int dy = Math.abs(y[j] - y[i]);
			
			if(d[i] == 'N') { //d[j] move east
				if(x[i] < x[j] || y[i]>y[j]) continue;
				
				if(dx<dy && check(j) >= dx) min = Math.min(min, dy);
			
			}else {
				if(x[i] > x[j] || y[i] < y[j]) continue;
				
				if(dx > dy && check(j) >= dy) min = Math.min(min, dx);
			}
		}
		
		return min;
	}

}
