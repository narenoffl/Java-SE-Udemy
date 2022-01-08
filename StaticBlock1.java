class StaticTest{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}

public class StaticBlock1 {
    public static void main(String[] args) {
        System.out.println("Main print");
        StaticTest t1 = new StaticTest();
    }
}
