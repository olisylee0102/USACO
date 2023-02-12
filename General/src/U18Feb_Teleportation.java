import java.io.*;
import java.util.*;
public class U18Feb_Teleportation {
	
	static String file = "teleport";
	static Scanner in;
	static PrintWriter out;
	static int a,b,x,y, ans;

	public static void main(String[] args) throws FileNotFoundException {
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();
		

	}
	
	static void init() {
		
		a = in.nextInt();
		b = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();
		
	}
	
	static void solve() {
		
		ans = Math.abs(a-b);
		
		ans = Math.min(ans, Math.abs(a-y) + Math.abs(x-b));
		
		
		ans = Math.min(ans, Math.abs(a-x) + Math.abs(y-b));
		
		out.println(ans);
	}

}
