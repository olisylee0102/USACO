import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class ULifeguards {
	
	static String file = "lifeguards";
	static Scanner in;
	static PrintWriter out;
	static int[][] a;
	static int[] time;
	static int total, count, n, start, end, min;
	

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
		
		a = new int[n][2];
		for(int i = 0; i<n; i++) {
			
			a[i][0] = in.nextInt();
			a[i][1] = in.nextInt();
		}
		
		//System.out.println(Arrays.deepToString(a));
		
		
		time = new int[1001];
	
	}
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			
			start = a[i][0];
			end = a[i][1];
			
			for(int j = start; j<end; j++) {
				time[j]++;
			}
		}
		
		//System.out.println(Arrays.toString(time));
		
		total = 0;
		for(int i = 0; i<1001; i++) {
			
			if(time[i]>0) total++;
		}
		
		min = 1002;
		
		for(int i = 0; i<n; i++) {
			
			start = a[i][0];
			end = a[i][1];
			count = 0;
			
			for(int j = start; j<end; j++) {
				if(time[j]==1) count++;
			}
			
			min = Math.min(min, count);
			
		}
		
	
		
		
		out.println(total-min);
		
			
		
		
		
		
	}

}
