public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        int r = 0;
        while(n>0)
        {
            r = n%10;
            sum = sum+(r*r*r);
            n = n/10;
        }

        if(temp==sum)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("No");
        }
    }
}
