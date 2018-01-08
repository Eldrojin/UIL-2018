package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Team {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("team.dat"));

		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			int N = sc.nextInt();
			int max = sc.nextInt();

			/* take in the integers */
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i = 0; i < N; i++) {
				sc.next();
				pq.add(-sc.nextInt());
			}

			/* output */
			int ans = 0;
			while(!pq.isEmpty() && max-->0) {
				ans -= pq.poll();
			}
			out.printf("%d\n",ans);

		}

	}
}