public class MethodsPractice1{

    static void change(int a[], int index, int value){
        a[index] = value;
    }

    public static void main(String[] args) {
        int a[] = {2,4,6,8,9};
        change(a,2,20);
        for(int x:a){
            System.out.println(x);
        }
    }

    // static void inc(int x){
    //     x++;
    //     System.out.println(x);
    // }
    // public static void main(String[] args) {
    //     int a = 10;
    //     inc(a);
    //     System.out.println(a);

    // }
}