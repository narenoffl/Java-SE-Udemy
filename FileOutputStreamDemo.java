import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream("F:\\Java-SE\\Test.txt");) {

            String str = "Learn Java Programming.";

            byte b[] = str.getBytes();
            fos.write(b);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
