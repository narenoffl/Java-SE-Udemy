public class OneDimensional {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        int b[] = {5,6,7,9,10};
        int c[] = new int[10];
        b[2] = 15;
        
        for(int i=0;i<a.length;i++)
        {
            //System.out.print(a[i]+" ");
            
        }

        for(int j=0;j<b.length;j++)
        {
            b[j]++;
        }
        for(int j=0;j<b.length;j++)
        {
            System.out.println(b[j]);
        }
        
    }
}
