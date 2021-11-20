import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8};
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(key==a[i]){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
