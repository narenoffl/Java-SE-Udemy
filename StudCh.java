//Conditional Statements - Student Challenges
import java.util.*;

public class StudCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if(n%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        // if(n>=50){System.out.println("Passmark");}
        // else{System.out.println("Fail");}

        if(n>=14 && n<=55){
            System.out.println("Young");
        }
        else{
            System.out.println("Not young");
        }

        sc.close();
    }
}
