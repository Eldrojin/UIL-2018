import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Rocio {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("rocio.dat"));

        while(in.hasNext()){
            String[] n = in.nextLine().split(" ");
            int a = Integer.parseInt(n[0].trim()), b = Integer.parseInt(n[1].trim());

            String[] line = new String[b];

            for(int i = 0; i < line.length; i++){
                line[i] = "";
            }

            for(int i = 0; i < b; i++){
                for(int c = 0; c < i; c++){
                    line[i] += " ";
                }

                line[i] += "*";

                for(int c = 0; c < a - ((i + 1) * 2); c++){
                    line[i] += " ";
                }

                line[i] += "*";
            }

            for(String c: line){
                    System.out.println(c);
            }

            for(int i = 0; i < a - (b * 2); i++){
                for(int c = 0; c < b; c++){
                    System.out.print(" ");
                }
                for(int c = 0; c < a - (b * 2); c++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i = line.length - 1; i >= 0; i--){
                    System.out.println(line[i]);
            }

            for(int i = 0; i < a; i++){
                System.out.print("=");
            }
            System.out.println();
        }

    }
}
