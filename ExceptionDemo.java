import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println("Division is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again - " +e);
        }
        System.out.println("Bye");
    }
}
