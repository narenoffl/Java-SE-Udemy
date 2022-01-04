class Super {
    public void display() {
        System.out.println("Hello World");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Hello Welcome");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub su = new Sub();
        su.display();
    }
}
