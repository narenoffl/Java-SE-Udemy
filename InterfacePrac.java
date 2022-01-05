interface Test {
    void test1();

    void test2();
}

class MyTest implements Test {
    public void test1() {
        System.out.println("test1 of class mytest");
    }

    public void test2() {
        System.out.println("test2 of class mytest");
    }

    public void test3() {
        System.out.println("test3 of class mytest");
    }
}

public class InterfacePrac {
    public static void main(String[] args) {
        Test t = new MyTest();
        t.test1();
        t.test2();

    }
}
