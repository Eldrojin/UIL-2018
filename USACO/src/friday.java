/*
ID: 18nguye1
LANG: JAVA
PROG: friday
 */

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.StringTokenizer;

public class friday {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        StringTokenizer in = new StringTokenizer(f.readLine());
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int numYears = new Integer(in.nextToken());

        LocalDate startDate = LocalDate.of(1900, Month.JANUARY, 13);
        LocalDate endDate = LocalDate.of(1900 + (numYears - 1), Month.DECEMBER, 31);
        int[] dayCount = new int[7];

        while (startDate.compareTo(endDate) < 0) {
            int dayOfWeek = startDate.getDayOfWeek().getValue() - 1;
            dayCount[dayOfWeek]++;
            startDate = startDate.plus(1, ChronoUnit.MONTHS);
        }
        out.println(dayCount[5] + " " + dayCount[6] + " " + dayCount[0] + " " + dayCount[1] + " "+ dayCount[2] + " "+ dayCount[3] + " "+ dayCount[4]);
        out.close();
    }
}
