import java.io.*;
import java.util.Scanner;
public class UOutofPlace {
	
	static String file = "outofplace";
	static Scanner in;
	static PrintWriter out;
	static int[] a;
	static int bessie, index, cnt, n;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();



	}

	
	static void init() {
		
		n = in.nextInt(); in.nextLine();
		a = new int[n];
		
		for(int i = 0; i<n; i++) {
			
			a[i] = in.nextInt();
			in.nextLine();
		}
		
		
	}
	
	static void solve(){
		
		for(int i = 1; i<n; i++) {
			if(a[i-1]>a[i]) {
				bessie = a[i];
				index = i;
			}
		}
		
		cnt = 0;
		
		for(int i = 0; i<index; i++) {
			if(a[i]>bessie) {
				if(a[i]!=a[i-1]) {
					cnt++;
				}
			}
		}
		
		
		out.println(cnt);
		
	}
}
