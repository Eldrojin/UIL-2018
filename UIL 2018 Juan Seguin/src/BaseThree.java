import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaseThree {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("base_three.dat"));
        while(in.hasNext())
        {
            int input = in.nextInt();
            String s = "";
            while(input >= 3)
            {
                s = (input % 3) + s;
                input /= 3;
            }
            System.out.println(input + s);
        }

    }
}

