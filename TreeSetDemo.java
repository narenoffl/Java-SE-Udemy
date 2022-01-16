import java.util.*;


public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(List.of(10,20,30,40));
        t.add(25);

        System.out.println(t);
    }
}
