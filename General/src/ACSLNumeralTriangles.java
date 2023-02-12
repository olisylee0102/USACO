import java.io.*;
import java.util.*;

public class ACSLNumeralTriangles{

    // TEST FILE NAME: input.txt

    static class Result {
        public static int method1(String line) {   
        	
        	
        	
        	
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("input.txt"));    // TEST FILE NAME: input.txt


        for (int i = 0; i < 5; i++) {
            int result = Result.method1(in.nextLine().trim());    //result's data type may be changed.

            System.out.println(result);
        }

        in.close();
    }
}