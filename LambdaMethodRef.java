import java.util.Locale;

interface LambdaRef{
    public int display(String str1, String str2);
}

public class LambdaMethodRef {
    public LambdaMethodRef(String s){
        System.out.println(s.toUpperCase(Locale.ROOT));
    }
    public static void main(String[] args) {
        LambdaRef l1 = String::compareTo;
        System.out.println(l1.display("hello", "world"));
        LambdaMethodRef le1 =  new LambdaMethodRef("Hello");
    }
}
