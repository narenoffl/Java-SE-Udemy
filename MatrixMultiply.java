public class MatrixMultiply {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{2,4,5},{6,7,8},{9,1,2}};
        int c[][] = new int[3][3];

       for(int i=0;i<a.length;i++){
           for(int j=0;j<b.length;j++){
            c[i][j] = 0;
            for(int k=0;k<c.length;k++)
            {
                c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
           }
       }

       for(int x[]:c){
           for(int y:x){
               System.out.print(y+" ");
           }
           System.out.println("");
       }
    }
}
