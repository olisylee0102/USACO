import java.io.*;
import java.util.Scanner;

public class USquarePasture {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int minx, maxx, miny, maxy, x1, y1, x2, y2, ans;
	static String[] line;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		minx = 0;
		maxx = 10;
		miny = 0;
		miny = 10;
		
		for(int i = 0; i<2; i++) {
			line = in.nextLine().split(" ");
			
			x1 = Integer.parseInt(line[0]);
			y1 = Integer.parseInt(line[1]);
			
			x2 = Integer.parseInt(line[2]);
			y2 = Integer.parseInt(line[3]);
			
			minx = Math.min(x1, minx);
			miny = Math.min(y1, miny);
			
			maxx = Math.max(x2, maxx);
			maxy = Math.max(y2, maxy);
			
		}
		
		
	}
	
	static void solve() {
		
		if((maxy-miny) > (maxx-minx)){
			ans = maxy-miny;
		
		}else {
			ans = maxx- minx;
		}
		
		out.println(ans);
		
		
	}

}
