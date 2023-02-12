import java.io.*;
import java.util.Scanner;
public class UBlockedBillboard2 {
	
	static String file = "billboard";
	static Scanner in;
	static PrintWriter out;
	static boolean[][] billboard;
	static int[] temp;
	static int minx, miny, maxx, maxy;

	
	public static void main(String[] args) throws FileNotFoundException {
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		
		temp = new int[8];
		
		for(int i = 0; i<8; i++) {
			temp[i] = in.nextInt() + 1000;
		}
		
		billboard = new boolean[2001][2001];
		
		minx = 3000;
		miny = 3000;
		maxx = 0;
		maxy = 0;
		
	}
	
	static void solve() {
		
		for(int i = temp[0]; i<temp[2]; i++) {
			for(int j = temp[1]; j<temp[3]; j++) {
				billboard[i][j] = true;
			}
		}
		
		for(int i = temp[4]; i<temp[6]; i++) {
			for(int j = temp[5]; j<temp[7]; j++) {
				billboard[i][j] = false;
			}
		}
		
		for(int i = 0; i<2001; i++) {
			for(int j = 0; j<2001; j++) {
				
				if(billboard[i][j]== true) {
					
					minx = Math.min(i, minx);
					miny = Math.min(j,  miny);
					maxx = Math.max(i,  maxx);
					maxy = Math.max(j,  maxy);
				}
			}
		}
		
		
		if(minx == 3000) out.println(0);
		
		else out.println((maxx-minx + 1) * (maxy-miny + 1));
		
	}

}
