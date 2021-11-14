import java.util.*;
public class CondStat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String num = sc.nextLine();

        // if(num.matches("[01]+"))
        // {
        //     System.out.println("Binary Radix=2");
        // }
        // else if(num.matches("[0-7]+"))
        // {
        //     System.out.println("Octal Radix=8");
        // }
        // else if(num.matches("[0-9A-F]+"))
        // {
        //     System.out.println("Hexa Radix=16");
        // }
        // else{
        //     System.out.println("Not a number");
        // }

        int num = sc.nextInt();

        if(num%4==0){
            if(num%100==0){
                if(num%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not leap year");
        }
        sc.close();
    }
}
