import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> ls = new HashSet<>(10); //Displays strings in same order
        ls.add("A");
        ls.add("C");
        ls.add("E");
        ls.add("K");
        ls.add("B");
        ls.add("G");
        ls.add("B");

        System.out.println(ls);

        Iterator<String> itr = ls.iterator(); //Displays string in sorted order
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }


    }
}
