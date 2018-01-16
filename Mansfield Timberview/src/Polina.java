import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Polina {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("polina.dat"));
        while (in.hasNext()){
            String[] line  = in.nextLine().split(" ");
            int[] n = new int[line.length - 1];

            String w = line[0];
            for(int i = 1; i < line.length; i++){
                n[i - 1] = Integer.parseInt(line[i]);
            }

            for(int i = 0; i < n.length; i++){

            }
        }
    }
}
