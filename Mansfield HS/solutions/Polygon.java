package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Polygon {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("polygon.dat"));
		
		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			int n = sc.nextInt();
			int s = sc.nextInt();

			/* output */
			out.printf("%.3f\n",n*s*s/Math.tan(Math.PI/n)/4);
		}

	}
}