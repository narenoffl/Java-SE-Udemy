public class Overloading {
    static int max (int x, int y){
        return x>y?x:y;
    }

    static float max(float x, float y)
    {
        return x>y?x:y;
    }

    static int max(int x, int y, int z){
        if(x>y && x>z)
            return x;
        else if(y>x && y>z)
            return y;
        else return z;        
    }

    public static void main(String[] args) {
        System.out.println(max(4,6));
        System.out.println(max(4.5f,7.8f));
        System.out.println(max(10,20,9));
    }
}
