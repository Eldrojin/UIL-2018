import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Chaoxiang {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("chaoxiang.dat"));

        while(in.hasNext()){
            Double n = Double.parseDouble(in.nextLine().trim());

            System.out.printf("%.2f%n", (n - 32) * (5.0/9) + 273.16);
        }
    }
}
