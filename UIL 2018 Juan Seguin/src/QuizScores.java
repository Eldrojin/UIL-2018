import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QuizScores {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("quiz_scores.dat"));
        int total = 0;
        while(in.hasNextLine())
        {
            total+= 60-new Integer(in.nextLine());
        }
        System.out.println("This team earned " + total + " point(s).");
    }
}
