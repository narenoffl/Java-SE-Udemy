class Outer1{
    int x = 10;
    static int y = 20;

    static class MyClass{
        public void show(){
            System.out.println(y);
        }
    }
}

public class StaticInner {
    public static void main(String[] args) {
    Outer1.MyClass myclass = new Outer1.MyClass();
    myclass.show();
    }
}
