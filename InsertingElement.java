public class InsertingElement {
    public static void main(String[] args) {
        int a[] = {3,9,7,4,5,32,65,112,90};
        int n=6;
        System.out.println("Before Inserting: ");
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println("");

        int x=20;
        int index=2;

        for(int i=n;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=x;

        System.out.println("After Inserting: ");
        for(int y:a)
        {
            System.out.print(y+" ");
        }

    }
}
