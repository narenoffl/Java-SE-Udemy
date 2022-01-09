import java.util.*;
import java.io.FileInputStream;

public class TryResources {
    static void Divide() throws Exception{
        try(FileInputStream fi = new FileInputStream("F:\\Jetbrains IDE Demo\\src\\FileHandling.txt");
        Scanner sc = new Scanner(fi);)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/c);
        }
    }

    public static void main(String[] args) throws Exception {
        try{
            Divide();
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
