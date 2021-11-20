public class TwoDimensionalArray {
    public static void main(String[] args) {
        int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // for(int i=0;i<M.length;i++)
        // {
        //     for(int j=0;j<M[0].length;j++){
        //         System.out.print(M[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        //for each loop
        for(int x[]:M){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        
    }
}
