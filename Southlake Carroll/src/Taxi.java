import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Taxi {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("taxi.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            int people = new Integer(in.nextLine());
            if(people == 0)
            {
                System.out.println("0 0 0");
            }
            else
            {
                int [] starts = new int[people];
                int [] times = new int[people];
                for (int i = 0; i < people; i++) {
                    String [] arr = in.nextLine().split(" ");
                    starts[i] = new Integer(arr[0]);
                    times[i] = new Integer(arr[1]);
                }

                int rides = 1;
                int abandon = 0;
                int cE = (Integer)times[0];
                for (int i = 1; i < times.length; i++) {
                    if(cE < (Integer)times[i])
                    {
                        cE = (Integer)times[i];
                        rides++;
                    }
                    else
                    {
                        abandon++;
                    }
                }
                System.out.println(rides+" "+abandon+" "+ (cE-(Integer)starts[0]));
            }
        }
    }
}
