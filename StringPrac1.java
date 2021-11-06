public class StringPrac1 {
    public static void main(String[] args) {
        String str1 = new String("Microsoft");
        int len = str1.length();
        String stru = str1.replace('o','a');
        System.out.println(len);

        String str2 = "         M I C R O S O F T       ";
        System.out.println(str2.trim());
        System.out.println(str2.toLowerCase()); 

        System.out.println(str1.substring(2,6));
        System.out.println(stru);
    }
}
