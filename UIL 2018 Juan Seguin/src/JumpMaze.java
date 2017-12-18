import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class JumpMaze {
    static boolean b = false;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("judge/jump_maze.dat"));
        while (in.hasNextLine()) {
            b = false;
            String[] dimList = in.nextLine().split("x");
            int xS = 0, yS = 0;
            char[][] map = new char[new Integer(dimList[1])][new Integer(dimList[0])];
            for (int i = 0; i < map.length; i++) {
                char[] line = in.nextLine().toCharArray();
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = line[j];
                    if (map[i][j] == 'S') {
                        yS = i;
                        xS = j;
                    }
                }
            }
            seek(map, xS, yS);
            System.out.println(b ? "keep" : "scrap");
        }
    }

    public static void seek(char[][] map, int x, int y) {
        if (y >= 0 && y < map.length && x >= 0 && x < map[y].length && map[y][x] != 'V' && map[y][x] != 'W') {
//           Scanner in = new Scanner(System.in);
//            for (char[] chars : map) {
//                for (char aChar : chars) {
//                    System.out.print(aChar);
//                }
//                System.out.println();
//            }
//            in.nextLine();
            if (map[y][x] == 'E') {
                b = true;
                return;
            }
            if (map[y][x] == 'J') {
                map[y][x] = 'V';
                seek(map, x + 2, y);
                seek(map, x - 2, y);
                seek(map, x, y + 2);
                seek(map, x, y - 2);
            } else {
                map[y][x] = 'V';
                seek(map, x + 1, y);
                seek(map, x - 1, y);
                seek(map, x, y + 1);
                seek(map, x, y - 1);
            }
        }
    }
}
