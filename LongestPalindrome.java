public class LongestPalindrome {
    private int maxLength;
    private int initialPoint;
    
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            getPalindromeSequence(s, i, i);
            getPalindromeSequence(s, i, i+1);
        }
        
        return s.substring(initialPoint, maxLength + initialPoint);
    }
    
    private void getPalindromeSequence(String s, int initPosition, int lastPosition) {
        while (initPosition >= 0 && lastPosition < s.length() && s.charAt(initPosition) == s.charAt(lastPosition)){
            initPosition--;
            lastPosition++;
        }
        if (maxLength < (lastPosition - initPosition - 1)) {
            maxLength = lastPosition - initPosition - 1;
            initialPoint = initPosition + 1;
        }
    }
}
