import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linus {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("linus.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            int num = new Integer(line[0]);
            int den = new Integer(line[1]);
            int mix = 0;
            if (num > den) {
                mix = num / den;
                num %= den;
            }
            int gcd = euclid(num, den);
            num /= gcd;
            den /= gcd;
            int wNum = num/den;
            System.out.println((mix > 0) ? mix + " " + num + "/" + den : (num % den == 0) ? "" + wNum : num + "/" + den);
        }
    }

    public static int euclid(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return euclid(b, a % b);
    }
}
