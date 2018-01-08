package solutions;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Encryption {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("encryption.dat"));

		int m = sc.nextInt();
		int c = sc.nextInt();
		int T = sc.nextInt(); sc.nextLine();
		while(T-->0) {
			String line = sc.nextLine();

			// for(int i = 0; i < line.length(); i++) {
				// if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
					// out.printf("%c",((line.charAt(i)-'A')*m+c)%26+'A');
				// }else out.printf("%c",line.charAt(i));
			// }out.printf("\n");

			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
					for(int j = 0; j < 26; j++) {
						if((j*m+c)%26 == line.charAt(i)-'A') {
							out.printf("%c",j+'A');
						}
					}
				}else out.printf("%c",line.charAt(i));
			}out.printf("\n");
		}

	}
}