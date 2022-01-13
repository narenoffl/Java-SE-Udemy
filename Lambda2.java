interface MyLambda2 {
    public int add(int x, int y);
}

public class Lambda2 {
    public static void main(String[] args) {
        MyLambda2 m2 = (a, b) -> a + b;
        int r = m2.add(20, 30);
        System.out.println(r);
    }
}
