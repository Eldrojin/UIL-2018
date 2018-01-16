import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.SetOverrideType;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Deshi {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("deshi.dat"));

        while(in.hasNext()){
            String w = in.nextLine().trim();
            int con = 0, vow = 0;
            String n = "";
            boolean good = true;

            for(int i = 0; i < w.length(); i++){
                n = w.substring(i, i + 1);
                    if(n.matches("[aeiou]")){
                        vow++;
                        con = 0;
                    }
                    else{
                        con++;
                        vow = 0;
                    }

                    if(con > 7 || vow > 4){
                        good = false;
                    }
            }

            System.out.print(good? "ACCEPTABLE" : "NOT ACCEPTABLE");
            System.out.println(" " + w);
        }
    }
}
