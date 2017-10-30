import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EnergonSupply {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("energon_supply.dat"));
        int input = in.nextInt();
        int sum = 0;
        for(int r = 0; r <= input/5; r++)
            for(int b = 0; b <= input/3; b++)
                for(int g = 0; g <= input; g++)
                {
                    sum = (r * 5) + (b * 3) + g;
                    if(sum == input)
                        System.out.println("(R-" + r + ",B-" + b + ",G-" + g + ")");
                }
    }
}