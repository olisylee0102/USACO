import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class UDaisyChains {
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n, count;
	static float sum, avg;
	static int[] a;

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
		}
		
		//System.out.println(Arrays.toString(a));
	}
	
	
	static void solve() {
		count = 0;
		for(int s = 0; s<n; s++) {
			
			for(int e = s; e<n; e++) {
				
				sum = 0;
				for(int i = s; i<=e; i++) {
					
					sum+=a[i];
				}
				
				//System.out.println(sum);
				avg = sum/(e-s + 1);
				
				//System.out.println(avg);
				
				//System.out.print("\n" + s + " " + e + " " + avg);
				
				for(int i = s; i<=e; i++) {
					
					//System.out.println(count);
					if(a[i]==avg) {
						
						//System.out.print("- " + i + " " + a[i]);
						count++; break;
					}
				}
				
			}
		}
		//System.out.println(count);
		out.println(count);
	}

}
