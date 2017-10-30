import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class QuizUpgrade {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("quiz_upgrade.dat"));
        int sets = new Integer(in.nextLine());
        TreeMap<Integer, String>map = new TreeMap<>();
        while(sets-->0)
        {
            String [] arr = in.nextLine().split(" - ");
            String team = arr[0];
            String [] scores = arr[1].split(",");
            int total = 0;
            for (int i = 0; i < scores.length; i++) {
                total+=60-new Integer(scores[i]);
            }
            map.put(total, team);
        }
        System.out.println("The top 3 teams are as follows:");
        Object[]scores = map.keySet().toArray();
        Object[]teams = map.values().toArray();
        System.out.println("1 - (" + teams[teams.length-1] + " - " + scores[scores.length-1] + ")");
        System.out.println("2 - (" + teams[teams.length-2] + " - " + scores[scores.length-2] + ")");
        System.out.println("3 - (" + teams[teams.length-3] + " - " + scores[scores.length-3] + ")");
    }
}
