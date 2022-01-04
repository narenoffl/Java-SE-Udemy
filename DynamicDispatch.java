class Super {
    public void meth1() {
        System.out.println("Super meth1");
    }

    public void meth2() {
        System.out.println("Super meth2");
    }
}

class Sub extends Super {
    public void meth2() {
        System.out.println("Sub meth1");
    }

    public void meth3() {
        System.out.println("Sub meth2");
    }
}

// Reference of the superclass and object of the subclass called and an override
// method also involved
public class DynamicDispatch {
    public static void main(String[] args) {
        Super sb = new Sub();
        sb.meth1();
        sb.meth2(); // Overriding method
    }
}
