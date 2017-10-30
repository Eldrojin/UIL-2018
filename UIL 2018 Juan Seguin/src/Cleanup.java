import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cleanup {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("cleanup.dat"));
        while(in.hasNextLine())
        {
            String [] arr = in.nextLine().split(" - ");
//            String [
        }
    }
}
