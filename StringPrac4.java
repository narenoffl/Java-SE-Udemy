public class StringPrac4 {
    public static void main(String[] args) {
        
        /* Regular Expressions */

        // String str1 = "a";
        // System.out.println(str1.matches("[abc]"));
        // System.out.println(str1.matches("a|b"));

        // String str2 = "programmer@hotmail.com";

        // int i = str2.indexOf("@");
        // String uname = str2.substring(0, i);
        // String domain = str2.substring(i+1, str2.length());
        // System.out.println("Username: "+uname+" Domain: "+domain);

        // int j=domain.indexOf(".");
        // String name=domain.substring(0, j);
        // System.out.println(name.equals("gmail"));

        int b = 1001100110;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));

        String str2 = "a%b34cdef*uvw";
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

        String str3 = "  abc   def   ghij   klmno";
        str3 = str3.replaceAll("\\s", "").trim();
        System.out.println("Trimmed word: "+str3);
        System.out.println(str3.length());
        String [] words = str3.split("\\s");
        System.out.println(words.length);
    }
}
