import java.io.*;

public class ByteReaderDemo {
    public static void main(String[] args) throws Exception {
        char c[]={'a','b','c','d','e','f','g','h','i','j'};

        CharArrayReader cra = new CharArrayReader(c);
        int x;
        while((x=cra.read())!=-1){
            System.out.print((char)x);
        }
        cra.close();
    }
}
