import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Trap101 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("trap101.dat"));
        int sets = new Integer(in.nextLine());
        /*while(sets-->0)
        {
            String [] arr = in.nextLine().split(" ");
            String [] one = in.nextLine().split(" ");
            String [] two = in.nextLine().split(" ");
            int total1 = 0;
            int total2 = 0;
            for (int i = 0; i < one.length; i++) {
                total1 += new Integer(one[i]);
            }
            for (int i = 0; i < two.length; i++) {
                total2 += new Integer(two[i]);
            }
            System.out.println(total1==total2? "works" : "doesn't work");
        }*/
        while(sets-->0)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            in.nextLine();
            int sumX = 0;
            int sumY = 0;
            for(int i = 0; i < x; i++)
            {
                sumX+= in.nextInt();
            }
            in.nextLine();
            for(int i = 0; i < y; i++)
            {
                sumY+= in.nextInt();
            }
            if(x == y && sumY == sumX)
            {
                System.out.println("works");
            }
            else
            {
                System.out.println("doesn't work");
            }

        }
    }
}
