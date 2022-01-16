import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception{

//        String data = "name=Vijay;address=Delhi;country=India;dept=CSE";

        FileInputStream fis = new FileInputStream("Property1.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String data = new String(b);

        StringTokenizer stk = new StringTokenizer(data,"=;");
        String s;
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}
