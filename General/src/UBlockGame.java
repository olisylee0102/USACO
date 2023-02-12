import java.io.*;
import java.util.Scanner;

public class UBlockGame {
	
	static String file = "blocks";
	static Scanner in;
	static PrintWriter out;
	static int[] a, b;
	static int[] count;
	static String alph, word;
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
		
		n = in.nextInt(); in.nextLine();
		
		count = new int[26];
		for(int i = 0; i<26; i++) {
			count[i] = 0;
		}
		
		alph = "abcdefghijklmnopqrstuvwxyz";
		
	}
		
	
	static void solve() {
		
		for(int i = 0; i<n; i++) {
			

			a = new int[26];
			b = new int[26];
			
			word = in.next();
			
			for(int j = 0; j<word.length(); j++) {
				a[word.charAt(j) - 'a'] ++;
			}
			
			word = in.next();
			
			for(int j = 0; j<word.length(); j++) {
				b[word.charAt(j) - 'a']++;
			}
			
			for(int j = 0; j<26; j++) {
				count[j] += Math.max(a[j], b[j]);
			}
		}
		
		
		
		for(int i = 0; i<26; i++) {
			out.println(count[i]);
		}
		
		
	}

}
