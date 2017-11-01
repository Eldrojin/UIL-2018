import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Cleanup {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("cleanup.dat"));
        while(in.hasNextLine())
        {
            String line = in.nextLine();
            line = line.replaceAll("[\\[\\]]", "");
            line = line.replaceAll(",", " ");
            line = line.replaceAll(" -", "");
            String[] input = line.split(" ");
            int container = new Integer(input[input.length - 1]);
            int[] path = new int[input.length - 1];
            for (int i = 0; i < path.length; i++) {
                path[i] = new Integer(input[i]);
            }
            System.out.println(cleanup(path, container, container, 0, 0));
        }
    }

    public static int cleanup(int[] path, int maxContain, int container, int hours, int pos) {
        if (container == maxContain) {
            cleanup(path, maxContain, container, hours + 1, pos - 1);
        }
        if (pos == 0) {
            boolean full = false;
            for (int i = 0; i < path.length; i++) {
                if (path[i] != 0) {
                    full = true;
                }
            }
            if (container == maxContain) {
                container = 0;
                if (full) {
                    cleanup(path, maxContain, container, hours + 1, pos + 1);
                }
            }
            if (full) {
                cleanup(path, maxContain, container, hours + 1, pos + 1);
            }
            return hours;
        }
        if (pos == path.length - 1) {
            if (path[pos] > 0) {
                container -= path[pos];
                if (container < 0) {
                    path[pos] += -container;
                    container = maxContain;
                }
                cleanup(path, maxContain, container, hours + 2, pos - 1);
            } else if (pos > 0) {
                if (path[pos] > 0) {
                    container -= path[pos];
                    if (container < 0) {
                        path[pos] += -container;
                        container = maxContain;
                        cleanup(path, maxContain, container, hours + 2, pos - 1);
                    }
                    cleanup(path, maxContain, container, hours + 1, pos + 1);
                }
            }
        }
    }
}
