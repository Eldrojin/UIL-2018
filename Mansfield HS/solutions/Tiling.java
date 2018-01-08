package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Tiling {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("tiling.dat"));

		int T = sc.nextInt();
		while(T-->0) {
			/* output */
			out.printf("%d\n",gcd(sc.nextInt(),sc.nextInt()));
		}

	}
	static int gcd(int a, int b) {
		while(a*b > 0) {
			int r = b%a;
			b = a;
			a = r;
		}return a+b;
	}
}