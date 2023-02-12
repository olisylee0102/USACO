import java.util.ArrayList;

public class subSet {
	static ArrayList<String> mask = new ArrayList<String>();

	public static void main(String[] args) {
		
		
	}
		
		
	static void bitMask(int n) {
		int last = (int)Math.pow(2,n);
		
		for(int i = 0; i<last; i++) {
			
			String bin = Integer.toBinaryString(i);
			
			while(bin.length()<n)
				bin = "0" + bin;
			
			mask.add(bin);
		}
		
		
	
	}
	
	static void makeSubset1(String str) {
		int n = 3;
		bitMask(n);
		
		
		for(String m: mask) {
			
			for(int i = 0; i<n; i++) {
				
			
				if(m.charAt(i)=='1') {
					System.out.println(str.charAt(i));
				}
			}
			
			System.out.println();
		}
	}
	
	


}
