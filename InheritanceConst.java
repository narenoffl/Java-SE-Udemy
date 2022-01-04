class Parent {
    public Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Class Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println();
    }
}

public class InheritanceConst {
    public static void main(String args[]) {
        GrandChild gc = new GrandChild();
    }
}
