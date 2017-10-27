import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class camila {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Judge Data/camila.dat"));
        while (in.hasNext()) {
            String name = in.nextLine();
            String firstletter = "" + name.charAt(0);
            String nameCode = "";
            name = name.substring(1).replaceAll("[AEIOUWHY]+", "");
            name = name.replaceAll("[BFPV]+", "1");
            name = name.replaceAll("[CGJKQSXZ]+", "2");
            name = name.replaceAll("[DT]+", "3");
            name = name.replaceAll("[L]+", "4");
            name = name.replaceAll("[MN]+", "5");
            name = name.replaceAll("[R]+", "6");
            if (name.length() < 3) {
                for (int i = name.length(); i < 3; i++) {
                    name += "0";
                }
            } else if (name.length() > 3) {
                name = name.substring(name.length() - 3);
            }
            System.out.println(firstletter + name);
        }
    }
}
