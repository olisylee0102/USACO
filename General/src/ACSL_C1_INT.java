import java.io.*;
import java.util.*;

public class ACSL_C1_INT{

    // TEST FILE NAME: input.txt

    static class Result {
        public static int method1(String line) {   
            String[] a = line.split(" ");
            
            int s = Integer.parseInt(a[0],8);
            int d = Integer.parseInt(a[1],8);
            int r = Integer.parseInt(a[2]);
            
            for(int i = 0; i<r; i++) {
            	for(int j = 0; j<i; j++) {
            		
            		s+=d;
            		
            	}
            }
            
            //s + ((r-1)r/2-1)*d
            
            String res = "";
            
            for(int i = 0; i<r; i++) {
            	res += Integer.toOctalString(s);
            	s+=d;
            }
            
            int sum = 0;
            
            for(int i = 0; i<res.length(); i++) {
            	sum+=res.charAt(i) - '0';
            }
            return sum;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);    // TEST FILE NAME: input.txt


        for (int i = 0; i < 5; i++) {
            int result = Result.method1(in.nextLine().trim());    //result's data type may be changed.

            System.out.println(result);
        }

        in.close();
    }
}