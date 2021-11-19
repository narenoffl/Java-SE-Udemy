import java.util.*;
public class ArithmeticProg {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the values");
     int a = sc.nextInt();
     int d = sc.nextInt();
     int n = sc.nextInt();
     int term = a;
     for(int i=0;i<n;i++)
     {
        System.out.print(term+","); 
        term = term+d;
         
     }
     
     sc.close();
    }   
}
