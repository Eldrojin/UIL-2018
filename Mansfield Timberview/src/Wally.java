import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wally {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("wally.dat"));
        ArrayList<String> keywords = new ArrayList<>();
        ArrayList<String> valid = new ArrayList<>();
        while (in.hasNextLine()) {
            String key = in.nextLine();
            if (key.equalsIgnoreCase("999"))
                break;
            keywords.add(key);
        }
        while (in.hasNextLine()) {
            String identifier = in.nextLine();
            if (!keywords.contains(identifier) && !identifier.matches("\\d\\w*")) {
                valid.add(identifier);
            }
        }
        Collections.sort(valid);
        for (String s : valid) {
            System.out.println(s);
        }

    }
}
