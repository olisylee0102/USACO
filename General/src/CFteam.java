import java.util.*;
public class CFteam {
	
	static Scanner in;
	static int n, sum, ans;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		n = in.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			sum = in.nextInt() + in.nextInt() + in.nextInt();
			if(sum>=2) ans++;
		}
		
		System.out.println(ans);
	}

}
