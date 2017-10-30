import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Passcode {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("judge/passcode.dat"));
        String line = in.nextLine();
        boolean[] mark = new boolean[line.length()];
        for (int i = 0; i < line.length(); i++) {
            char theChar = line.charAt(i);
            if (!Character.isLetter(theChar) || theChar == ' ')
                continue;
            if (isPrime(i) && ifConsonant("" + theChar)) {
                line = line.substring(0, i) + findNextConsonant("" + line.charAt(i)) + line.substring(i + 1);
                mark[i] = true;
            }
        }
        for (int i = 0; i < line.length(); i++) {
            char theChar = line.charAt(i);
            if (!Character.isLetter(theChar) || theChar == ' ')
                continue;
            String charAt = "" + line.charAt(i);
            if (i % 2 == 0 && !ifConsonant(charAt)) {
                if (isUpperCase(charAt))
                    charAt = charAt.toLowerCase();
                else
                    charAt = charAt.toUpperCase();
                line = line.substring(0, i) + charAt + line.substring(i + 1);
            } else if (i % 2 != 0 && ifConsonant(charAt) && !mark[i]) {
                line = line.substring(0, i) + "*" + line.substring(i + 1);
            }
        }
        line = line.replaceAll(" ", "");
        System.out.println(line);
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n <= 1 || n % i == 0)
                return false;
        }
        return true;
    }

    static boolean ifConsonant(String l) {
        l = l.toLowerCase();
        switch(l) {
            case "a":
                return false;
            case "e":
                return false;
            case "i":
                return false;
            case "o":
                return false;
            case "u":
                return false;
        }
        return true;
    }

    static String findNextConsonant(String l) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        l = l.toLowerCase();
        int i = alphabet.indexOf(l);
        for (; i < alphabet.length(); i++) {
            if (alphabet.charAt(i) != l.charAt(0) && ifConsonant("" + alphabet.charAt(i)))
                return "" + alphabet.charAt(i);
            if (i == 25) {
                i = 0;
            }
        }
        return l;
    }

    static boolean isUpperCase(String l) {
        if (l.charAt(0) <= 'Z') {
            return true;
        }
        return false;
    }
}
