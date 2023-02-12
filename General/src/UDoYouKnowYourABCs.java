import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class UDoYouKnowYourABCs {
	
	static Scanner in;

	static int a, b, c;
	static int[] arr;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		init();
		solve();
	}
	
	static void init() {
		arr = new int[7];
		for(int i = 0; i<7; i++) {
			arr[i] = in.nextInt();
		}
	}
	
	static void solve() {
		
		Arrays.sort(arr);
		
		a = arr[0];
		b = arr[1];
		c = arr[6] - a - b;
		
		System.out.print(a + " " + b + " " + c);
		
	}

}
