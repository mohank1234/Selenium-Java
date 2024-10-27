import java.util.*;
public class Palindrome
{
    public static void  pali()
    {
        int n = 454,temp,rev =0;
        temp =n;
        while(n>0) {
            temp = n;
            int var = n % 10;
            rev = rev * 10 + var;
            n = n / 10;
            System.out.println(rev);
            if (temp == rev) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
      private static void withscanner() {
          String original, reverse = ""; // Objects of String class
          Scanner in = new Scanner(System.in);
          System.out.println("Enter a string/number to check if it is a palindrome");
          original = in.nextLine();
          int length = original.length();
          for (int i = length - 1; i >= 0; i--)
              reverse = reverse + original.charAt(i);
          if (original.equals(reverse))
              System.out.println("Entered string/number is a palindrome.");
          else
              System.out.println("Entered string/number isn't a palindrome.");
      }
    public static void main(String args[])
    {
        withscanner();
        pali();
    }
}