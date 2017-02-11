public class PalindromeInteger {
    public boolean isPalindrome(int x) {
        if (x < 0)  { return false;}
        if (x <= 9) { return true;}
        
        int reverseX = 0;
        int originalX = x;
        while (x > 0) {
            int unitDigit = x % 10;
            if (reverseX > Integer.MAX_VALUE / 10) {
                return false;
            }
            reverseX = reverseX * 10 + unitDigit;
            x = x / 10;
        }
        return (originalX == reverseX);
    }
}
