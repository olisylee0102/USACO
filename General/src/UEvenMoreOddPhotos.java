import java.io.*;
import java.util.Scanner;
public class UEvenMoreOddPhotos {
	static Scanner in;
	static int n, cnt, e, o, ans;
	static String[] id;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		init();
		solve();
	
	}
	
	static void init() {
		
		n = in.nextInt(); in.nextLine();
		id = new String[n];
		id = in.nextLine().split(" ");
		
	}
	
	static void solve() {
		
		cnt = 0;
		
		for(int i = 0; i<id.length; i++) {
			if(Integer.parseInt(id[i])%2==0) {
				
				for(int j = i; j<id.length; i++) {
					if((Integer.parseInt(id[i]) + Integer.parseInt(id[i+1]))%2 ==0) cnt++;
				}
			}
		}
		
		e = cnt;
		o = cnt;
		ans = 0;
		
		while(e<0) {
			o-=2;
			e++;
		}
		
		e = cnt;
		o = cnt;
		
		while(e>=o) {
			if(e>o) ans = o*2 + 1;
			else ans = o*2;
		}
		
		System.out.println(ans);
		
	}

}
