import java.io.File;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Isabel {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("isabel.dat"));
        ArrayList<String> list=  new ArrayList<>();
        while(in.hasNextLine())
        {
            String [] arr = in.nextLine().split(" ");
            LocalDate date = LocalDate.of(new Integer(arr[1]), new Integer(arr[2]), new Integer(arr[3]));
            String month = date.getMonth().toString().toLowerCase();
            month = month.substring(0,1).toUpperCase() + month.substring(1);
            int day = 0;
            switch(date.getDayOfWeek().toString())
            {
                case "SUNDAY": day = 1; break;
                case "MONDAY": day = 2; break;
                case "TUESDAY": day = 3; break;
                case "WEDNESDAY": day = 4; break;
                case "THURSDAY": day = 5; break;
                case "FRIDAY": day = 6; break;
                case "SATURDAY": day = 7; break;
            }
            String s = day + " " + arr[0]+ " " + month + " " + date.getDayOfMonth() + ", " + date.getYear();
            list.add(s);

        }
        Collections.sort(list);
        ArrayList<String >list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String [] arr2 = list.get(i).split(" ");
            String day = "";
            switch(new Integer(arr2[0]))
            {
                case 1: day = "Sunday"; break;
                case 2: day = "Monday"; break;
                case 3: day = "Tuesday"; break;
                case 4: day = "Wednesday"; break;
                case 5: day = "Thursday"; break;
                case 6: day = "Friday"; break;
                case 7: day = "Saturday"; break;
            }
            list1.add(String.format("%-11s: %s, %s %s %s", arr2[1], day, arr2[2], arr2[3], arr2[4]));
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

    }
}
