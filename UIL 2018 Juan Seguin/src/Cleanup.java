import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Cleanup {
    static int hours;
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

            System.out.println(cleanup(new Integer(input[input.length - 1]), 0, 0));
        }
    }

    public static int cleanup(int cap, int load, int pos) {
//        if (pos == 0) {
//            boolean b = true;
//            for (int i : path) {
//                if (i != 0)
//                    b = false;
//            }
//            if (b) {
//                return ;
//            }
//        }
//        if (pos < path.length && pos >= 0) {
//            if (load == cap) {
//                if (pos == 0) {
//                    load = 0;
//                    return cleanup(cap, load, pos + 1);
//                } else {
//                    hours++;
//                    cleanup(cap, load, pos - 1);
//                }
//            } else {
//
//            }
        int diff = 0;
        load += path[pos];
        diff = path[pos];
        if (pos == 0) {
            boolean b = true;
            for (int i : path) {
                if (i != 0)
                    b = false;
            }
            if (!b) {
                return 1 + cleanup(cap, load, pos + 1);
            } else if (load == cap) {
                return 2;
            } else if (load > cap) {
                diff = load - cap;
                path[pos] = diff;
                load = cap;
                return 2;
            } else if (pos == path.length - 1) {
                load += path[pos];
                path[pos] -= diff;
                if (path[pos] == 0) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                path[pos] -= diff;
                return 1 + cleanup(cap, load, pos + 1);
            }
        }

        return 0;
    }
}
