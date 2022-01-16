import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(20,0.75f);
        h.add(34);
        h.add(45);
        h.add(28);
        h.add(65);
        h.add(20);
        System.out.print(h+" ");
    }
}
