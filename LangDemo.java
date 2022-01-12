import java.lang.*;

class MyObject {
    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();

    }

}

public class LangDemo {
    public static void main(String[] args) {
        MyObject ob1 = new MyObject();
        MyObject ob2 = new MyObject();
        System.out.println(ob1.equals(ob2));
    }
}
