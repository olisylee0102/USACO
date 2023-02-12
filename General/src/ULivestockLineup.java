import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class ULivestockLineup {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static String[] cows, pair;
	static String[][] conditions;
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
		cows = "Bessie Buttercup Belinda Beatrice Bella Blue Betsy Sue".split(" ");
		Arrays.sort(cows);
		
		n = Integer.parseInt(in.nextLine());
		
		conditions = new String[][n];
		
		for(int i = 0; i<n; i++) {
			
			pair = in.nextLine().split(" must be milked inside");
			conditions[i] = pair;
		}
		
		
		
		
	}
	
	static void solve() {
		
		
	}
	
	static String[] permute(String[] currOrder, int k, String[][] conditions) {
		
		if(k==cows.length) {
			//check
		}
		
		else {
			for(int i = 0; )
		}
	}

}
