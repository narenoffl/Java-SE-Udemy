import java.util.*;
public class GeometricProg {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the values");
     int a = sc.nextInt();
     int r = sc.nextInt();
     int n = sc.nextInt();
     int term = a;
     for(int i=0;i<n;i++)
     {
        System.out.print(term+","); 
        term = term*r;
         
     }
     sc.close();
 }   
}
