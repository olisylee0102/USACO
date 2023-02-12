import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
public class UBackAndForth {
	
	static String file = "backforth";
	static Scanner in;
	static PrintWriter out;
	static int[] a, b, originala, originalb;
	static int milk1, milk2, sum;
	static HashSet<Integer> set;

	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File(file + ".in"));
		out = new PrintWriter(new File(file + ".out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		originala = new int[10];
		originalb = new int[10];
		a = new int[10];
		b = new int[10];
		set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			originala[i] = in.nextInt();
			a[i] = originala[i];
		}
		
		in.nextLine();
		
		for(int i = 0; i<10; i++) {
			originalb[i] = in.nextInt();
			b[i] = originalb[i];
		}
		
		
	}
	
	static void solve() {
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				
				milk1 = -a[i] + b[j];
				swap(i, j);
				
				for(int k = 0; k<10; k++) {
					for(int p = 0; p<10; p++) {
						
						milk2 = -a[k] + b[p];
						sum = milk1 + milk2;
						set.add(sum);
						
					}
				}
				
				a = originala.clone();
				b = originalb.clone();
			}
		}
		
		out.println(set.size());
		
	}
	
	static void swap(int i, int j) {
		int temp = a[i];
		a[i] = b[j];
		b[j] = temp;
	}
	

}
