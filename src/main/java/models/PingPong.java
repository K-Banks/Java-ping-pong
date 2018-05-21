package models;

import java.util.ArrayList;
import java.util.List;

public class PingPong {

    public ArrayList<Object> runPingPong(int countUpTo) {
        ArrayList<Object> result = new ArrayList<Object>();
        for (Integer index=1; index<=countUpTo; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                result.add("beepboop");
            } else if (index % 3 == 0) {
                result.add("beep");
            } else if(index % 5 == 0){
                result.add("boop");
            } else {
                result.add(index);
            }
        }
        return result;
    }
}
