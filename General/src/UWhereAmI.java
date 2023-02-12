import java.io.*;
import java.util.Scanner;
public class UWhereAmI {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n;
	static String s;

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
		s = in.next();
		
	}
	
	static void solve() {
		
		int ans = 0; 
		boolean ok = true;
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 0; j<=n-i; j++) {
				
				String temp = s.substring(j, j+i);
				
				if(s.indexOf(temp)!=s.lastIndexOf(temp)) {
					ok = false;
					break;
				}
			}
			
			if(ok) {
				ans = i;
				break;
			}
			
			ok = true;
		}
		
		out.println(ans);
	}

}
