public class FinallyDemo {
    static void meth1() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.println("Final Message"); // definitely execute
        }
    }

    public static void main(String[] args) throws Exception {
        meth1();
    }
}
