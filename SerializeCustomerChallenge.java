import java.io.*;
import java.util.*;

class SECustomer implements Serializable {
    String name;
    String ID;
    String PhoneNo;

    static int Count = 1;

    public SECustomer() {
    }

    public SECustomer(String name, String phone) {
        this.name = name;
        ID = "C" + Count;
        Count++;
        PhoneNo = phone;
    }


    public String toString() {
        return "Name : " + name + " \nCustomer ID : " + ID + " \nPhone Number : " + PhoneNo;
    }
}

public class SerializeCustomerChallenge {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fos2 = new FileOutputStream("Customer.txt");
//        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
//
//        SECustomer cus[] = {
//                new SECustomer("Naren", "12345"),
//                new SECustomer("manoj", "97910"),
//                new SECustomer("twitter", "98721"),
//        };
//        oos2.writeInt(cus.length);
//
//        for (SECustomer cust : cus) {
//            oos2.writeObject(cust);
//        }
//        oos2.close();
//        fos2.close();

        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        SECustomer c[] = new SECustomer[length];

        for (int i = 0; i < length; i++) {
            c[i] = (SECustomer) ois.readObject();

        }
        System.out.println(" Enter the name of the Customer : ");
        String name = sc.next();

        for (int i = 0; i < length; i++) {
            if (name.equalsIgnoreCase(c[i].name))
                System.out.println(" " + c[i]);
        }
        ois.close();
        fis.close();
    }
}
