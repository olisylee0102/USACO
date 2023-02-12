import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class UBlockedBillboard1 {
	
	static String file = "billboard";
	static Scanner in;
	static PrintWriter out;
	static boolean[][] billboard;
	static int[] temp;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		
		billboard = new boolean[2001][2001];
		temp = new int[12];
		
		for(int i = 0; i<12; i++) {
			temp[i] = in.nextInt() + 1000;
		}
		
	}
	
	static void solve() {
		
		
		for(int i = temp[0]; i<temp[2]; i++) {
			for(int j = temp[1]; j<temp[3]; j++) {
				billboard[i][j] = true;
			}
		}
		
		for(int i = temp[4]; i<temp[6]; i++) {
			for(int j = temp[5]; j<temp[7]; j++) {
				billboard[i][j] = true;
			}
		}
		
		for(int i = temp[8]; i<temp[10]; i++) {
			for(int j = temp[9]; j<temp[11]; j++) {
				billboard[i][j] = false;
			}
		}
		
		for(int i =0; i<2001; i++) {
			for(int j = 0; j<2001; j++) {
				
				if(billboard[i][j] == true) count++;
			}
		}
				
		out.println(count);

	}

}
