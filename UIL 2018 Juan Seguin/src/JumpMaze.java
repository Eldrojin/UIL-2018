import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JumpMaze {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("jump_maze.dat"));
        while(in.hasNextLine())
        {
            String [] dimensions = in.nextLine().split("x");
            char[][]map = new char[new Integer(dimensions[0])][new Integer(dimensions[1])];
            for (int i = 0; i < new Integer(dimensions[1]); i++) {
                map[i] = in.nextLine().toCharArray();
            }
            int x = 0, y = 0;
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if(map[i][j] == 'S')
                    {
                        x=i; y = j;
                    }
                }
            }
            System.out.println(maze(map, x, y)? "keep" : "scrap");
        }
    }
    public static boolean maze(char[][]map, int x, int y)
    {
        if(x < map.length && x >= 0 && y < map[0].length && y>=0)
        {
            char temp = map[x][y];
            map[x][y] = 'X';
            if(temp == 'S' || temp == '-')
            {
                maze(map, x-1, y);
                maze(map, x+1, y);
                maze(map, x, y+1);
                maze(map, x, y-1);
            }
            if(temp == 'J')
            {
                maze(map, x-2, y);
                maze(map, x+2, y);
                maze(map, x, y+2);
                maze(map, x, y-2);
            }
            if(temp == 'E')
            {
                return true;
            }
            map[x][y] = temp;
        }
        return false;
    }


}
