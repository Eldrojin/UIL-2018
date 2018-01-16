import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Vicente {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("vicente.dat"));
        while (in.hasNextLine()) {
            String line[] = in.nextLine().split(" ");
            int num = Integer.parseInt(line[0], 2);
            int org = num;
            int bitCount = 0;
            for (char c : line[0].toCharArray()) {
                if (c == '1') {
                    bitCount += 1;
                }
            }
            num <<= 1;
            if (line[1].equalsIgnoreCase("EVEN")) {
                if (bitCount % 2 == 0) {
                    System.out.println(Integer.toHexString(org).toUpperCase() + " " + Integer.toHexString(num).toUpperCase());
                } else
                System.out.println(Integer.toHexString(org).toUpperCase() + " " + Integer.toHexString(num + 1).toUpperCase());
            } else {
                if (bitCount % 2 == 1) {
                    System.out.println(Integer.toHexString(org).toUpperCase() + " " + Integer.toHexString(num).toUpperCase());
                } else
                System.out.println(Integer.toHexString(org).toUpperCase() + " " + Integer.toHexString(num).toUpperCase());
            }
        }
    }
}
