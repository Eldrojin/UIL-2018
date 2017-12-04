import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("weight.dat"));
        int n = new Integer(in.nextLine());
        while(n-->0)
        {
            String [] arr = in.nextLine().split(" ");
            int d = new Integer(arr[0]);
            int r1 =new Integer(arr[1]);
            int r2 =new Integer(arr[2]);
            int h =new Integer(arr[3]);
            int Final = (int)Math.round(1000*d*h*(Math.PI*Math.pow(r1, 2) - Math.PI*Math.pow(r2, 2)));
            System.out.println((double)Final/1000);
        }
    }
}