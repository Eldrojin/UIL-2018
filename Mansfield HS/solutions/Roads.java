package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Roads {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("roads.dat"));

		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			N = sc.nextInt();
			int M = sc.nextInt();

			adj = new ArrayList<>();
			for(int i = 0; i < N; i++) adj.add(new ArrayList<Integer>());
			int[] deg = new int[N];
			for(int i = 0; i < M; i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				adj.get(a).add(b);
				adj.get(b).add(a);
				deg[a]++;
				deg[b]++;
			}

			boolean good = true;
			int odd = 0;
			for(int i = 0; i < N; i++) if(deg[i]%2!=0) odd++;
			if(odd > 2) good = false;

			reach = new boolean[N];
			for(int i = 0; i < N; i++) if(deg[i] > 0) {
				flood(i);
				break;
			}
			for(int i = 0; i < N; i++) if(deg[i] > 0 && !reach[i]) good = false;

			if(good) out.printf("YES\n");
			else out.printf("NO\n");
		}

	}
	static boolean[] reach;
	static int N;
	static ArrayList<ArrayList<Integer>> adj;
	static void flood(int j) {
		if(reach[j]) return;
		reach[j] = true;
		for(int i = 0; i < adj.get(j).size(); i++) flood(adj.get(j).get(i));
	}
}