import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Cleanup {
    static int hours = 0;
    static int[] path;
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("cleanup.dat"));
        while(in.hasNextLine())
        {
            String line = in.nextLine();
            line = line.replaceAll("[\\[\\]]", "");
            line = line.replaceAll(",", " ");
            line = line.replaceAll(" -", "");
            String[] input = line.split(" ");
            hours = 0;
            int container = new Integer(input[input.length - 1]);
            int[] path = new int[input.length - 1];
            for (int i = 0; i < path.length; i++) {
                path[i] = new Integer(input[i]);
            }
            System.out.println(Arrays.toString(path));
            Cleanup.path = path;
            cleanup(new Integer(input[input.length - 1]), 0, 0);
            System.out.println(hours);
        }
    }

    public static void cleanup(int cap, int load, int pos) {
        boolean b = false;
        for (int i : path) {
            if (i != 0)
                b = true;
        }
        if (b) {
            return;
        }
        if (pos < path.length && pos >= 0) {
            if (load == cap) {
                if (pos == 0) {
                    load = 0;
                    cleanup(cap, load, pos + 1);
                } else {
                    hours++;
                    cleanup(cap, load, pos - 1);
                }
            } else {
                int diff = 0;
                load += path[pos];
                diff = path[pos];
                if (load == cap) {
                    hours+= 2;
                    cleanup(cap, load, pos - 1);
                } else if (load > cap) {
                    diff = load - cap;
                    path[pos] = diff;
                    hours += 2;
                    load = cap;
                    cleanup(cap, load, pos-1);
                } else if (pos == path.length - 1) {
                    hours+=2;
                    load += path[pos];
                    path[pos] -= diff;
                    cleanup(cap, load, pos-1);
                } else {
                    path[pos] -= diff;
                    hours++;
                    cleanup(cap, load, pos + 1);
                }
            }
        }
    }
}
