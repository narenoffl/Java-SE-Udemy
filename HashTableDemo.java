import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"a");
        ht.put(2,"b");
        String s = (String)ht.get(3);
        //System.out.println(ht);

        Enumeration e = ht.keys();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        ht.computeIfAbsent(2,k->"Z"+k);

        System.out.println(ht);
    }
}
