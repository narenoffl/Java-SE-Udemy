import java.util.*;

class MyComp implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new MyComp());
        p.add(10);
        p.add(20);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());
        p.forEach((x)->System.out.println(x));
        p.poll();
        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));
    }
}
