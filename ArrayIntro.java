public class ArrayIntro{
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        for(int j=a.length-1;j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }
}