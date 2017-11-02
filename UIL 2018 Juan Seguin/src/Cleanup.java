import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Cleanup {
    static int hours = 0;
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
            System.out.println(hours);
        }
    }

    public static void cleanup(int[] path, int maxContain, int container, int pos) {
        if (pos == 0) {
            boolean full = false;
            for (int i = 0; i < path.length; i++) {
                if (path[i] != 0) {
                    full = true;
                }
            }
            if (container <= 0) {
                container = maxContain;
                if (full) {
                     cleanup(path, maxContain, container,pos + 1);
                     hours+=2;
                }
            }
            if (full) {
                 cleanup(path, maxContain, container,pos + 1);
                 hours++;
            }
        }
        if (pos == path.length - 1) {
            if (path[pos] > 0) {
                container -= path[pos];
                if (container < 0) {
                    path[pos] += -container;
                    container = maxContain;
                }
                 cleanup(path, maxContain, container, pos - 1);
                hours++;
            } else if (pos > 0) {
                if (path[pos] > 0) {
                    container -= path[pos];
                    if (container < 0) {
                        path[pos] += -container;
                        container = maxContain;
                         cleanup(path, maxContain, container, pos - 1);
                         hours++;
                    }
                     cleanup(path, maxContain, container,pos + 1);
                    hours++;
                }
            }
        }
    }
}
