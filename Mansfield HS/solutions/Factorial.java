package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Factorial {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("factorial.dat"));

		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			int n = sc.nextInt();

			/* output */
			for(int i = n; i > 0; i--) {
				if(i != n) out.printf("x");
				out.printf("%d",i);
			}out.printf("\n");
		}
	}
}