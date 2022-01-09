public class NestedCatch {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 0};
        try {
            int c = a[0] / a[2];
            System.out.println("Division of c is " + c);

            try {
                System.out.println(a[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Proper Index value should be given - " + e);
                e.printStackTrace();
            }
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero - " + e);
        }

        System.out.println("End of the program");
    }
}
