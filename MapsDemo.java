import java.util.*;
import java.util.Map.*;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "a", 1, "b", 2, "c"));
        hm.put(4, "e");
        hm.put(5, "f");
        System.out.println(hm);

        //System.out.println(hm.ceilingEntry(5).getValue());
        System.out.println(hm.containsKey(4));


//        Entry<Integer,String> e = hm.firstEntry();
//        System.out.println(e.getKey()+" "+e.getValue());
    }
}
