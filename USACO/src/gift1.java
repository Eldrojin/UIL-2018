/*
ID: 18nguye1
LANG: JAVA
PROG: gift1
*/

import java.io.*;
import java.util.*;

public class gift1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("gift1.in"));
        int groupNum = new Integer(in.nextLine());
        HashMap group = new HashMap<String, Integer>();
        for (int i = 0; i < groupNum; i++) {
            group.put(in.nextLine(), 0);
        }
        while (in.hasNext()) {
            String memGive = in.nextLine();
            String moneyShare = in.nextLine();
            String[] money = moneyShare.split(" ");
            int groupNumShare = new Integer(new Integer(money[1]));
            int memGiveBack = 0;
            int moneyGive = 0;
            if (new Integer(money[1]) > 0) {
                moneyGive = (new Integer(money[0])) / (new Integer(money[1]));
                memGiveBack = (new Integer(money[0])) % (new Integer(money[1]));
                for (int i = 0; i < groupNumShare; i++) {
                    String groupMem = in.nextLine();
                    group.replace(groupMem, (int)group.get(groupMem) + moneyGive);
                    group.replace(memGive, (int)group.get(memGive) - moneyGive);
                }
                group.replace(memGive, (int)group.get(memGive) + memGiveBack);
            } else {
                memGiveBack = new Integer(money[0]);
                group.replace(memGive, (int)group.get(memGive) + memGiveBack);
            }
        }
        System.out.println(group);
    }
}
