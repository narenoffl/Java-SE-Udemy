import java.util.*;
public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();

        int totalArea = 2*(length*breadth+breadth*height+length*height);
        int volume = length*breadth*height;

        System.out.println("Area "+totalArea+" Volume "+volume);
        sc.close();
    }
}
