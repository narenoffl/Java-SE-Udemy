public class IncrementDecrement {
    public static void main(String[] args) {
        // int x = 5;
        // int y = x++;
        // System.out.println(x+" "+y);

        int x = 5, y = 4, z;
        z = 2* x++ + 3* ++y;
        
        System.out.println(z);

        float f = 3.25f;
        f++;
        System.out.println(f);

        char ch = 'a';
        ch++;
        System.out.println(ch);

        byte b = 5;
        b++;
        System.out.println(b);
    }
}
