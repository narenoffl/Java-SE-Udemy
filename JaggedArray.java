public class JaggedArray {
    public static void main(String[] args) {
        int x[][];
        x = new int[3][];

        x[0] = new int[5];
        x[1] = new int[7];
        x[2] = new int[6];

        for(int a[]:x){
            for(int y:a)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
