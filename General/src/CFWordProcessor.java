import java.io.*;
import java.util.Scanner;
public class CFWordProcessor {

	static String file = "word";
	static Scanner in;
	static PrintWriter out;
	static int n, k;
	static String str;
	static String[] arr;
	
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
		k = in.nextInt(); in.nextLine();
		str = in.nextLine();
		
	}
	
	static void solve() {
		
		StringBuilder sb = new StringBuilder();
		
		arr = str.split(" ");
		sb.append(arr[0]);
		int temp = arr[0].length();
		
		for(int i = 1; i<n; i++) {
			
			int length = arr[i].length();
			int sum = temp + length;
			
			if(sum<=k) {
				
				sb.append(" ").append(arr[i]);
				temp+=length;
				
			}else {
				
				sb.append("\n").append(arr[i]);
				temp = length;
			}
		}
		
		out.println(sb.toString());
		
		
	}

}
