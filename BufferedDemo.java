import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws Exception {
        FileReader fis1 = new FileReader("Source1.txt");
        BufferedReader bis1 = new BufferedReader(fis1);

        //FileInputReader-FileReader
        //BufferedInputStream-BufferedReader

        System.out.println((char)bis1.read());
        System.out.println((char)bis1.read());
        System.out.println((char)bis1.read());
        bis1.mark(10);
        System.out.println((char)bis1.read());
        System.out.println((char)bis1.read());
        bis1.reset();
        System.out.println((char)bis1.read());
        System.out.println((char)bis1.read());

        System.out.println(bis1.readLine());
        //System.out.println(bis1.markSupported());
    }
}
