import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ULeaders {
	
	static Scanner in;
	static int n, countg, counth;
	static String[] cows, list;
	static ArrayList<Integer> a[];
	static ArrayList<Integer> leaderh;
	static ArrayList<Integer> leaderg;
	static ArrayList<Integer> g;
	static ArrayList<Integer> h;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		init();
		solve();
		
	}
	
	
	static void init() {
		
		n = in.nextInt(); in.nextLine();
		cows = new String[n]; 
		list = new String[n];
		cows = in.nextLine().split("");
		list = in.nextLine().split(" ");
		
		a = new ArrayList[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = new ArrayList<Integer>();
			
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(Integer.parseInt(list[j])>=Integer.parseInt(list[i])) a[i].add(j);
			}
		}
		
		g = new ArrayList<Integer>();
		h = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++) {
			if(cows[i].equals("G")) g.add(i);
			else h.add(i);
		}
		
		
		leaderg = new ArrayList<Integer>();
		leaderh = new ArrayList<Integer>();
		
		
	}
	
	static void solve() {
		
		countg = 0;
		counth = 0;
		
		for(int i = 0; i<n; i++) {
			if(cows[i] == "G") {
				for(int j = 0; j<g.size(); j++) {
					
					for(int k = 0; k<g.size(); k++) {
						if(a[g.get(j)].contains(g.get(k))) countg++;
					}
					
					if(countg == g.size()) leaderg.add(j);
				}
				
				
			}
			else {
				for(int j = 0; j<h.size(); j++) {
					
					for(int k = 0; k<h.size(); k++) {
						if(a[h.get(j)].contains(h.get(k))) counth++;
					}
					
					if(counth == h.size()) leaderh.add(j);
				}
				
				
			}
		}
		
		/*for(int i = 0; i<n; i++) {
			for(int j = 0; j<a[i].size(); j++) {
				
				if(cows[i].equals("G")) {
					if(g.contains(a[i].get(j))) countg++;
				
			}
			
			if(countg == g.size()) leaderg.add(i);
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<h.size(); j++) {
				
				if(cows[i].equals("H")) {
					if(h.contains(a[i].get(j))) counth++;
				}
			}
			
			if(counth == h.size()) leaderh.add(i);
		}
		*/
		
		/*for(int i = 0; i<leaderg.size(); i++) {
			System.out.print(leaderg.get(i));
		}
		
		System.out.println("");
		for(int i = 0; i<leaderh.size(); i++) {
			System.out.print(leaderh.get(i));
		}
		*/
		
		System.out.println(leaderg.size() * leaderh.size());
		
		
	}

}
