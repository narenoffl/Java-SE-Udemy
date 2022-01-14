import java.io.*;

public class FileHandlingDirectory {
    public static void main(String[] args) throws Exception {
        File f = new File("F://Jetbrains IDE Demo");

        System.out.println(f.isDirectory());
        File list[] = f.listFiles();

        for (File x : list) {
            System.out.println(x.getParent() + " " + x.getName());
        }
    }
}
