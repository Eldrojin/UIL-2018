package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Coinsagain {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("coinsagain.dat"));

		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			m = sc.nextInt();
			val = new int[m];
			for(int i = 0; i < m; i++) val[i] = sc.nextInt();
			Arrays.sort(val);

			int coin = sc.nextInt();
			parent = new int[coin+1];
			memo = new int[coin+1];
			for(int i = 0; i <= coin; i++) memo[i] = -1;

			/* output */
			out.printf("Minimum coins: %d\n",minCoins(coin));

			int curr = coin;
			while(curr != 0) {
				if(curr != coin) out.printf(" ");
				out.printf("%d",curr-parent[curr]);
				curr = parent[curr];
			}out.printf("\n");

		}

	}
	static int[] parent;
	static int[] val;
	static int[] memo;
	static int m;
	static int minCoins(int c) {
		if(c == 0) {
			return 0;
		}
		if(memo[c] != -1) return memo[c];
		int ans = 1000000;
		for(int i = val.length-1; i >= 0; i--) {
			if(c - val[i] < 0) continue;
			int next = minCoins(c-val[i])+1;
			if(next < ans) {
				ans = next;
				parent[c] = c-val[i];
			}
		}
		return memo[c] = ans;
	}
}