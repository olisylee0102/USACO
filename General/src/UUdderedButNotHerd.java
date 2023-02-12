import java.io.*;
import java.util.Scanner;
public class UUdderedButNotHerd {
	
	static Scanner in;
	static String alp;
	static String[] letter;
	static int cnt;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		init();
		solve();
		

	}
	
	static void init() {
		
		alp = in.nextLine();
		letter = in.nextLine().split("");
		cnt = 0;
		
		
	}
	
	static void solve() {
		
		for(int i = 1; i<letter.length; i++) {
			
			if(alp.indexOf(letter[i])<=alp.indexOf(letter[i-1])) cnt++;
	
		}
		
		System.out.println(cnt + 1);
		
	}

}
