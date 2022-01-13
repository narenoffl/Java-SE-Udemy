interface MyLambda3 {
    public void display();
}

class useLambda {
    public void callLambda(MyLambda3 m3) {
        m3.display();
    }
}

class Demo {
    public void method1() {
        useLambda u1 = new useLambda();
        u1.callLambda(() -> {
            System.out.println("Hello World");
        });
    }
}

public class LambdaCapture {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
