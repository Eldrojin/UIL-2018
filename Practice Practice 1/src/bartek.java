import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bartek {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Judge Data/bartek.dat"));
        while (in.hasNext()) {
            int size = in.nextInt();
            int dimensions = size + (size - 2) * 2 + 2;
            String[][] octagon = new String[dimensions][dimensions];
            int innerSpace = size;
            int outerSpace = size - 1;
            int innerCounter = size - 2;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < outerSpace; j++) {
                    System.out.print(" ");
                }
                if (i == 0) {
                    for (int j = 0; j < size; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int j = 0; j < innerSpace; j++) {
                        System.out.print(" ");
                    }
                    if (i != 0) System.out.print("*");
                    innerSpace += 2;
                }
                outerSpace -= 1;
                System.out.println();
            }
            innerSpace -= 2;
            for (int i = 0; i < size - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < innerSpace; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for (int i = 0; i < dimensions - ((size - 2) + size) - 1; i++) {
                outerSpace++;
                for (int j = 0; j < outerSpace; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < innerSpace; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                innerSpace -= 2;
                System.out.println();
            }
            outerSpace++;
            for (int j = 0; j < outerSpace; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            for (int j = 0; j < outerSpace; j++) {
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
