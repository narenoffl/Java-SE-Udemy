import java.io.*;

class StudentDetail implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public StudentDetail() {
    }

    public StudentDetail(int r, String n, float a, String d) {
        rollno = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll " + rollno +
                "\nName " + name +
                "\nAverage " + avg +
                "\nDept " + dept +
                "\nData " + Data +
                "\nTransient " + t + "\n";
    }
}

public class ObjectStreamDemo {
    public static void main(String[] args) throws Exception {
        /*
        FileOutputStream fos = new FileOutputStream("Student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        StudentDetail s = new StudentDetail(10, "John", 89.9f, "CSE");

        oos.writeObject(s);

        fos.close();
        oos.close();

         */

        FileInputStream fis=new FileInputStream("Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        StudentDetail s=(StudentDetail)ois.readObject();

        System.out.println(s);

        fis.close();
        ois.close();
    }
}
