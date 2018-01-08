package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Harmonic {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("harmonic.dat"));

		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			int n = sc.nextInt();

			/* sum up the 1/n */
			double sum = 0;
			for(int i = 1; i <= n; i++) sum += 1.0/i;

			/* output */
			out.printf("%.3f\n",sum);
		}
	}
}