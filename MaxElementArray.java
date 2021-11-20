// public class MaxElementArray {
//     public static void main(String[] args) {
//         int a[] = {1,2,3,4,5,6,7,8};
//         int max = a[0];
//         for(int i=0;i<a.length;i++)
//         {
//             if(a[i]>max){
//                 max=a[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

// To find out second max element
public class MaxElementArray{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int max1,max2;
        max1=max2=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println("Second max: "+max2);
    }
}

