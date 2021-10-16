import java.util.*;

public class AreaExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the base and height");
        // float base = sc.nextFloat();
        // float height = sc.nextFloat();
        // float area = (base*height)/2;

        // System.out.println("Area of triangle: "+area);

        //Area using all the three sides

        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        float s = (d+e+f)/2f;
        double area = Math.sqrt(s*(s-d)*(s-e)*(s-f));

        System.out.println("Area "+area);

        sc.close();

    }
}
