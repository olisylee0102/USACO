import java.io.*;
import java.util.Scanner;
public class UMilkMeasurement {
	
	static String file = "test";
	static Scanner in;
	static PrintWriter out;
	static int n, day, change, b, e, m, winner, answer;
	static boolean bleader, eleader, mleader, bwin, ewin, mwin;
	static int[] changes;
	static String name;
	static String[] names;

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
		changes = new int[100];
		names = new String[100];
		answer = 0;
		
		for(int i = 0; i<n; i++) {
			String[] line = in.nextLine().split(" ");
			day = Integer.parseInt(line[0]);
			name = line[1];
			change = Integer.parseInt(line[2]);
			
			changes[day-1] = change;
			names[day-1] = name;
			
			b = 7;
			e = 7;
			m = 7;
			
			bleader = true;
			eleader = true;
			mleader = true;
		}
	}
	
	static void solve() {
		
		for(int i = 0l i<100; i++) {
			if(changes[i]!=0) {
				switch(names[i]) {
				case "Bessie": b+=changes[i]; break;
				case "Elsie": e+=changes[i]; break;
				case "Mildred": m+=changes[i]; break;
				}
			}
			
			winner = Math.max(b, Math.max(e, m));
			
			bwin = b == winner;
			ewin = e == winner;
			mwin = m == winner;
			
			if(bwin!=bleader || ewin!=eleader || mwin!=mleader) answer ++;
			
			bwin = bleader;
			ewin = eleader;
			mwin = mleader;
			
		}
		
		out.println(answer);
		
	}

}
