public class DisplayDigits {
    public static void main(String[] args) {
        int n = 299;
        int rem=0;
        while(n>0)
        {
            rem = n%10;
            n = n/10;
            System.out.println(rem);
        }
        System.out.println(n); //prints 0 because loop terminates
    }
}
