import javax.xml.crypto.Data;
import java.io.*;

class StudentClass{
    int rollno;
    String name;
    float avg;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        //file writing methods
        FileOutputStream fos1 = new FileOutputStream("Student2.txt");
        DataOutputStream dos1 = new DataOutputStream(fos1);

        StudentClass s1 = new StudentClass();
        s1.rollno = 10;
        s1.name = "Naren";
        s1.dept = "CSE";
        s1.avg = 83.6f;
        dos1.writeInt(s1.rollno);
        dos1.writeUTF(s1.name);
        dos1.writeUTF(s1.dept);
        dos1.writeFloat(s1.avg);
        dos1.close();
        fos1.close();

        // file reading methods
        FileInputStream fis1 = new FileInputStream("Student2.txt");
        DataInputStream dis1 = new DataInputStream(fis1);

        StudentClass s2 = new StudentClass();
        s2.rollno = dis1.readInt();
        s2.name = dis1.readUTF();
        s2.dept = dis1.readUTF();
        s2.avg = dis1.readFloat();

        System.out.println("Roll no "+s2.rollno);
        System.out.println("Name "+s2.name);
        System.out.println("Average "+s2.avg);
        System.out.println("Dept "+s2.dept);

        fis1.close();
        dis1.close();

    }
}
