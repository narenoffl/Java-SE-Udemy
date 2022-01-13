@FunctionalInterface
interface MyLambda {
    public void display();
}

public class LambdaExpression {
    public static void main(String[] args) {
        //lambda expression
        MyLambda m = () -> {
            System.out.println("Hello World");
        };
        m.display();
    }
}
