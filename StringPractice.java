public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Javaprogram";
        String str2 = new String("Javalang");

        byte[]c = {65,66,67,68};
        String str4 = new String(c,1,2);

        char []ch = {'H','e','l','l','o'};
        String str5 = new String(ch,1,3);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str4);
        System.out.println(str5);

        System.out.println(str1==str2);

    }
}
