import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bartek {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Judge Data/bartek.dat"));
        while (in.hasNext()) {
            int size = in.nextInt();
            for (int i = 0; i < size - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < size - 1; i++) {
                System.out.print(" ");
            }
            System.out.println();
            int bSpaceNum = 0;
            for (int i = 0; i < size - 1; i++) {
                String space = "";
                for (int j = i + 1; j < size - (i + 1); j++) {
                    space += " ";
                }
                System.out.print(space + "*");
                for (int j = 0; j < size + bSpaceNum; j++) {
                    System.out.print(" ");
                }
                bSpaceNum += 2;
                System.out.print("*" + space);
                System.out.println();
            }
            for (int i = 0; i < size - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < size + 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
