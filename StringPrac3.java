public class StringPrac3 {
    public static void main(String[] args) {
        String str1="Pyramid";
        String str2="pyramid";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);

        String str4 = "the great wall ";
        String str5 = "of china";
        System.out.println(str4+str5);
    }
}
