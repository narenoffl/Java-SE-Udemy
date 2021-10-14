public class Literals {
    public static void main(String[]args)
    {
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println("Trying different datatypes");

        long lno = 9999999L;
        float fno = 12.56f;
        double dno = 345.65d;

        System.out.println(lno+" "+fno+" "+dno+" ");
    }
}
