import java.io.FileOutputStream;
import java.util.*;

public class PropertyDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        p.setProperty("Brand","Dell");
        p.setProperty("Processor","i7");
        p.setProperty("OS","Windows 10");
        p.setProperty("Model","Vostro");

        System.out.println(p);

        p.store(new FileOutputStream("Property1.txt"),"Laptop");
        p.storeToXML(new FileOutputStream("Property2.xml"),"Laptop");
    }
}
