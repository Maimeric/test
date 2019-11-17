package Task5;

public class Work5 {
    public static boolean isPalindrome(int integer) {
        int palindr = integer;
        int reverse = 0;

        while (palindr != 0) {
            int remaind = palindr % 10;
            reverse = reverse * 10 + remaind;
            palindr = palindr / 10;
        }
        return integer == reverse;
    }
}
