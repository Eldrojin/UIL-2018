import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class adam {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Judge Data/adam.dat"));
        while (in.hasNext()) {
            System.out.println(in.nextInt() >= in.nextInt());
        }
    }
}
