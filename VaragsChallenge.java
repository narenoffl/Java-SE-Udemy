public class VaragsChallenge {
    public static void main(String[] args) {

        // System.out.println(max());
        // System.out.println(max(10));
        // System.out.println(max(10,20,30));
        // System.out.println(max(20,30,40,12,50));

        System.out.println(sum());
        System.out.println(sum(10,20,100));
        System.out.println(sum(200,200,100,200));
        System.out.println(sum(100,500,1500));
        System.out.println("Sum of elements is: "+sumnum(10,20,30));

        
    }

    static int sumnum(int...B)
    {
        int sum1=0;
        for(int j=0;j<B.length;j++){
            sum1+=B[j];
        }
        return sum1;
    }

    static double sum(double ...P)
    {
        double sum=0;
        
        for(int i=0;i<P.length;i++)
            sum+=P[i];
        
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;
        
    }

    static int max(int ...A)
    {
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        int max = A[0];
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
        

    }
}
