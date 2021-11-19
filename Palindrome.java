//Program to check the palindrome and reverse of a number - combined

public class Palindrome {
    public static void main(String[] args) {
        int n = 12345;
        int temp = n;
        int r=0;
        int rev = 0;
        while(n>0)
        {
            r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        if(rev==temp)
        {
            System.out.println("Palindrome");
            System.out.println(rev);
        }
        else{
            System.out.println("No");
            System.out.println(rev);
        }
    }
}
