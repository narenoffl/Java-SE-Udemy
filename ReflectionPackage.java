import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}

public class ReflectionPackage
{
    public static void main(String[] args)
    {
        Class c=My.class;

        Field field[]=c.getDeclaredFields(); // Displaying array of fields declared

        for(Field fi1:field)
            System.out.println(fi1);

        System.out.println("--------------------------------------------");

        Method meth[]=c.getMethods(); // Displaying array of methods

        for(Method m:meth)
            System.out.println(m);

        System.out.println("--------------------------------------------");

        Parameter param[]=meth[0].getParameters(); // Displaying array of parameters

        for(Parameter p:param)
        {
            System.out.println(p);
        }

    }
}