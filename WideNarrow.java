public class WideNarrow {
    public static void main(String[] args) {
        byte b=5;
        short s=120;
        int i=10;
        long l=10;
        //float f=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true; 
        
        // b=(byte)s;
        // System.out.println(b);
        // i=s;
        // l=s;
        // f=s;
        // d=s;

        i=(int)f;
        f=i;
        d=f;
        f=(float)d;

        System.out.println(i);
        
    }
}
