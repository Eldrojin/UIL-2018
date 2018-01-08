package solutions;

import static java.lang.System.*;

public class Coins {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("coins.dat"));

		int T = sc.nextInt();
		while(T-->0) {
			/* input */
			int n = sc.nextInt();

			/* lower the coin threshold until the first value that is at least .5 */
			double prob = 0;
			int thres = n;
			while(prob < .5) {
				prob += Math.pow(.5,n)*choose(n,thres);
				thres--;
			}

			/* output */
			out.printf("%d\n",thres+1);
			/* the answer can also be gained by rounding up n/2 */
		}
	}
	static int choose(int n, int r) {
		if(n < r) return 0;
		if(r == 0 || n == r) return 1;
		return choose(n-1,r-1) + choose(n-1,r);
	}
}