import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Klara {
    static char [][]map;
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("klara.dat"));
        while(in.hasNextLine())
        {
            int size = new Integer(in.nextLine());
            map = new char[size][size];
            for (int i = 0; i < size; i++) {
                map[i] = in.nextLine().toCharArray();
            }
            int start = size/2;
            fill(start,start, map[start][start]);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            System.out.println("=====");
        }
    }
    public static void fill(int i, int j, char key)
    {
        if(i>= 0 && j >= 0 && i<map.length && j< map.length)
        {
            if(map[i][j] == key)
            {
                map[i][j] = '-';
                fill(i+1, j, key);
                fill(i-1, j, key);
                fill(i, j+1, key);
                fill(i, j-1, key);
            }
        }
    }
}
