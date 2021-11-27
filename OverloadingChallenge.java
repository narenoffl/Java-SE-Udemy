public class OverloadingChallenge {
    public static void main(String[] args) {
        
    }

    boolean validate(int age)
    {
        return (age>=3 && age<=15); //boolean condition returns true or false
    }

    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }

    static double RecArea(double x, double y){
        return x*y;
    }

    static double areaCircle(double radius)
    {
        return Math.PI*radius*radius;
    }

    int reverse(int n)
    {
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        return rev;
    }

    int[] reverse(int[] a)
    {
        int b[] = new int[a.length];
        for(int i=a.length,j=0;i>=0;i--,j++)
        {
            b[j]=a[i];
        }
        return b;
    }
}
