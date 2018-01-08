package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Factors {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("factors.dat"));

		sieve(1000000);

		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			int f = sc.nextInt();

			/* count divisors */
			int div = 1;
			for(int i = 0; primes.get(i) <= f; i++) {
				int exp = 0;
				int pow = primes.get(i);
				while(pow <= f) {
					exp += f / pow;
					pow *= primes.get(i);
				}
				div *= (exp+1);
			}

			/* output */
			out.printf("%d\n",div);
		}

	}
	static ArrayList<Integer> primes;
	static void sieve(int n) {
		boolean[] num = new boolean[n+1];
		primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; i <= n; i+=2) {
			if(num[i]) continue;
			primes.add(i);
			for(int j = i+i; j <= n; j+=i) num[j] = true;
		}
	}
}