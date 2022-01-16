import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        Integer a[] = {1,2,4,6,7,8,9,11,13,5};
        //int b[] = {2,4,6,7,1,5,10,9};
        //System.out.println(Arrays.compare(a,b));

        //int c[] = Arrays.copyOf(b,b.length);
        Arrays.sort(a, new My());
        for(Integer x:a){
            System.out.print(x+" ");
        }

        //System.out.println(Arrays.binarySearch(c,2));
    }
}
