import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("hospital.dat"));
        int sets= new Integer(in.nextLine());
        while(sets-->0)
        {
            String [] arr = in.nextLine().split(" ");
            for (int i = 1; i <= new Integer(arr[0]); i++) {
                for (int j = 1; j <= new Integer(arr[1]); j++) {
                    System.out.println("floor " + i + " room " + j);
                }
            }
            if(sets != 0) System.out.println();
        }
    }
}
