public class CommandLineArgs {
    public static void main(String[] args) {
        double sum=0;
        for(String x:args)
        {
            if(x.matches("[0-9\\.]+")){
                sum=sum+Double.parseDouble(x);
            }
        }
        System.out.println(sum);
        
        // for(String s: args)
        // {
        //     System.out.println(s);
        // }
    }
}
