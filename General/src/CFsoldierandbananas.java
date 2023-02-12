import java.util.*;
public class CFsoldierandbananas {
	
	static Scanner in;
	static long k,n,w,ans;
	

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		k = in.nextLong();
		n = in.nextLong();
		w = in.nextLong();
		
		ans = 0l;
		
		/*int sum = 0;
		
		for(int i = 1; i<=w; i++) {
			sum+=i;
			
		}
		
		ans = k * sum - n;
		
		*/
		
		ans = k * (w*(w+1)/2) - n;
		if(ans<0) ans = 0;
		System.out.println(ans);

	}

}
