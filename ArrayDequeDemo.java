import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq1 = new ArrayDeque<>();
        adq1.offerLast(10);
        adq1.offerLast(20);
        adq1.offerLast(30);
        adq1.offerLast(40);

        adq1.pollFirst();

//        adq1.forEach((x)->System.out.println(x));

        adq1.offerFirst(1);
        adq1.offerFirst(2);
        adq1.offerFirst(3);
        adq1.offerFirst(4);

        adq1.forEach((x)->System.out.println(x));
    }
}
