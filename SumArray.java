public class SumArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0;i<arr1.length;i++)
        {
            sum = sum + arr1[i];
        }
        System.out.println(sum); // sum gives 55

        for(int x:arr1){
            sum = sum+x;
        }
        System.out.println(sum); // sum value is already 55 so adding them gives 110
    }
}
