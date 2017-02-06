public class LengthOfLongestSubstring {
    
    public int lengthOfLongestSubstring(String s) {
            int length = 0, maxLength = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            int savePointer = Integer.MIN_VALUE;
            
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    if (map.get(s.charAt(i)) > savePointer) {
                        length = i - map.get(s.charAt(i));
                        savePointer = map.get(s.charAt(i));
                    } else {
                        length++;
                    }
                    
                } else {
                    length++;
                }
                
                maxLength = Math.max(maxLength, length);
                map.put(s.charAt(i), i);
            }
            return maxLength;
        
    }
}
