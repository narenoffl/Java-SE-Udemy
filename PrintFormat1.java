public class PrintFormat1 {
    public static void main(String[] args) {
        
        //System.out.printf("Hello");
        /*
        int x=10;
        float y=12.65f;
        char ch = 'A';
        String str = "Java"; */
        // System.out.printf("Variables: %d %e %c World",x,y,ch);
        // System.out.printf("%3$s %2$f %1$d",x,y,str);

        String str = "Java";
        System.out.printf("%20s",str);
        float a = -123.45f;
        System.out.printf("%(6.2f",a);
    }   
}
