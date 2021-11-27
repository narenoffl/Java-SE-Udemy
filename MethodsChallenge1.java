public class MethodsChallenge1 {
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(91));
        MethodsChallenge1 gcdx = new MethodsChallenge1();
        System.out.println(gcdx.gcd(35,56));
    }

    int gcd(int a, int b)
    {
        while(a!=b)
        {
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
            
        }
        return a;
    }
}
