public class LeftSwitchArray {
   public static void main(String[] args) {
       int a[] = {1,2,3,4,5,6,7,8,9,11};
       for(int x:a)
       {
           System.out.print(x+" ");
       }
       System.out.println("");
       int temp = a[0];
       for(int i=1;i<a.length;i++)
       {
           a[i-1] = a[i];
       }
       a[a.length-1] = temp;

       for(int y:a)
       {
           System.out.print(y+" ");
       }

   } 
}
