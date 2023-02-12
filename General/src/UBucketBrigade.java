import java.io.*;
import java.util.Scanner;

public class UBucketBrigade {
	
	static String file = "buckets";
	static Scanner in;
	static PrintWriter out;
	static int bx, by, lx, ly, rx, ry;
	static char[][] arr;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		arr = new char[10][];
		
		for(int i = 0; i<10; i++) {
			arr[i] = in.next().toCharArray();
		}
		
	}
	
	static void solve() {
		
		for(int i=0; i<10; i++) {
			
			for(int j = 0; j<10; j++) {
				
				if(arr[i][j] == 'B') {
					bx = i;
					by = j;
				}else if(arr[i][j] == 'L') {
					lx = i;
					ly = j;
				}else if(arr[i][j] == 'R'){
					rx = i;
					ry = j;
				}
				
				
			}
		}
		int ans = Math.abs(lx-bx) + Math.abs(ly-by)-1;
		
		if(check()) ans+=2;
		out.println(ans);
		
	}
	
	static boolean check() {
		
		//1 BRL
		if(bx == rx && rx==lx && ry>by && ry<ly) return true;
		
		//2LRB
		else if(bx == rx && rx==lx && ly<ry && ry<by) return true;
		
		//3VerticalBRL
		else if(by == ry && ry == ly && bx<rx && rx<lx) return true;
		
		//4VerticalLRB
		else if(by == ry && ry == ly && lx<rx && rx<bx) return true;
		
		else return false;
	}

}
