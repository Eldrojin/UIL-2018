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
            System.out.println(cleanup(new Integer(input[input.length - 1]), 0, 0));
        }
    }

    public static int cleanup(int cap, int load, int pos) {
        if (pos < path.length && pos >= 0) {
            if (pos == 0 && load == cap) {
                for (int i : path) {
                    if (i != 0)
                        return 1 + cleanup(cap, 0, pos + 1);
                }
                return 1;
            }
            if (load == cap) {
                return 1 + cleanup(cap, load, pos - 1);
            }
            load += path[pos];
            path[pos] = 0;
            if (load >= cap) {
                path[pos] = load - cap;
                load = cap;
                if (pos == path.length - 1) {
                    if (path[pos] == 0) {
                        return 2 + cleanup(cap, load, pos - 1);
                    }
                }
                return 2 + cleanup(cap, load, pos - 1);
            } else if (pos == path.length - 1) {
                return 2 + cleanup(cap, cap, pos - 1);
            }
            return 1 + cleanup(cap, load, pos + 1);
        }
        return 2;
    }
}
