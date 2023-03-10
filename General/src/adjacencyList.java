import java.util.*;
import java.io.*;
public class adjacencyList {

	static Scanner in;
	static int n, m;
	static ArrayList<Integer> a[];
	static ArrayList<String> b[];

	
	public static void main(String[] args) throws IOException {
		try {
			init();
						
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	static void init() throws IOException {
		in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();
		
		a = new ArrayList[n];
		b = new ArrayList[n];
	
		for(int i=0; i<n; i++) {
			a[i] = new ArrayList<Integer>();
			b[i] = new ArrayList<String>();
			for(int j=1;j<=4; j++)	b[i].add(j+"");
		}
				
		for(int i=0; i<m; i++) {
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			a[x].add(y);
			a[y].add(x);
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}
}