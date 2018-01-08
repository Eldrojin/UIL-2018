package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class DNA {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("dna.dat"));
		
		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			a = sc.next();
			b = sc.next();
			memo = new int[a.length()+1][b.length()+1];
			for(int i = 0; i <= a.length(); i++) for(int j = 0; j <= b.length(); j++) memo[i][j] = -1;

			/* output */
			out.printf("%d\n",dist(a.length(),b.length()));

		}

	}
	static String a;
	static String b;
	static int[][] memo;
	static int dist(int i, int j) {
		if(i == 0 || j == 0) return memo[i][j] = Math.max(i,j);
		if(memo[i][j] != -1) return memo[i][j];
		if(a.charAt(i-1) == b.charAt(j-1)) return memo[i][j] = Math.min(Math.min(dist(i-1,j)+1,dist(i,j-1)+1),dist(i-1,j-1));
		else return memo[i][j] = Math.min(Math.min(dist(i-1,j)+1,dist(i,j-1)+1),dist(i-1,j-1)+1);
	}
}