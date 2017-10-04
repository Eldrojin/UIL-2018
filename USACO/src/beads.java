/*
ID: 18nguye1
LANG: JAVA
PROG: beads
*/

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("beads.in"));
        StringTokenizer in = new StringTokenizer(f.readLine());
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

        int beadSize = new Integer(in.nextToken());
        int maxColorBeadAmount = 0;
        in = new StringTokenizer(f.readLine());
        String necklaceRead = in.nextToken().toLowerCase();
        char[] necklace = necklaceRead.toCharArray();

//        out.println(necklaceRead);

        for (int i = 1; i < necklace.length; i++) {
            int outIndex = i;
            int b = 0;
            char[] splitNecklace = new char[necklace.length];
            for (int j = outIndex; j < necklace.length; j++, b++) {
                splitNecklace[b] = necklace[j];
            }
            for (int j = 0; j < outIndex; j++, b++) {
                splitNecklace[b] = necklace[j];
            }
            int inCount = 0, outCount = 0, inScan = 0, outScan = splitNecklace.length - 1;
            String splitNecklaceString = new String (splitNecklace);
            char inColor = 'w';
            char outColor = 'w';
            System.out.println(splitNecklaceString);
            int inIndexR = splitNecklaceString.indexOf('r'), inIndexB = splitNecklaceString.indexOf('b');
            int outIndexR = splitNecklaceString.lastIndexOf('r'), outIndexB = splitNecklaceString.lastIndexOf('b');
            if (inIndexR >= 0 || inIndexB >= 0) {
                if (inIndexR < 0) {
                    inColor = 'b';
                } else if (inIndexB < 0) {
                    inColor = 'r';
                } else {
                    inColor = (inIndexR < inIndexB ? 'r' : 'b');
                }
            }

            if (outIndexR >= 0 || outIndexB >= 0) {
                if (outIndexR < 0) {
                    outColor = 'b';
                } else if (outIndexB < 0) {
                    outColor = 'r';
                } else {
                    outColor = (outIndexR > outIndexB ? 'r' : 'b');
                }
            }

            while (inScan < splitNecklace.length && (splitNecklace[inScan] == inColor || splitNecklace[inScan] == 'w')) {
                inScan++;
                inCount++;
            }
            while (outScan >= 0 && (splitNecklace[outScan] == outColor || splitNecklace[outScan] == 'w')) {
                outScan--;
                outCount++;
            }
            System.out.println(inColor + " : " + inCount + "\n" + outColor + " : " + outCount);
            System.out.println();
            if (outCount + inCount < splitNecklace.length) {
                if (outCount + inCount > maxColorBeadAmount) {
                    maxColorBeadAmount = inCount + outCount;
                }
            } else if (outCount + inCount >= splitNecklace.length) {
                maxColorBeadAmount = splitNecklace.length;
            }
            //out.println(Arrays.toString(splitNecklace));
        }
        out.println(maxColorBeadAmount);
        out.close();
    }
}
