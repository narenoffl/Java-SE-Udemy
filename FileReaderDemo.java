import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("F:\\Java-SE\\Test.txt");) {

            int x;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
