public class ArrayCopy {
    //Reverse copy of an array
    public static void main(String[] args) 
    {
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        
        for(int x:B)
        {
            System.out.println(x+",");
        }
        
        //System.out.println("Length of b: "+b.length);
    }
    
    
    
    
    
    
    
    
    
    
    
    // public static void main(String[] args) {
    //     int a[] = {2,4,6,8,10,12,14,16};
    //     int b[] = new int[8];
    //     System.out.println("Length of a: "+a.length);
    //     for(int i=0;i<a.length;i++)
    //     {
    //         b[i] = a[i];
    //     }
    //     a=b;

    //     for(int j=0;j<b.length;j++)
    //     {
    //         System.out.println(b[j]);
    //     }
    //     System.out.println("Length of b: "+b.length);
    // }
}
