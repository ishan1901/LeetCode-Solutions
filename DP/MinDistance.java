public class MinDistance {
    public int minDistancerRecursive(String word1, String word2) {
        if (word1.length() <= 1) {
            return word2.length();
        }
        if (word2.length() <= 1) {
            return word1.length();
        }
        if (word1.charAt(0) == word2.charAt(0)) {
            return minDistance(word1.substring(1), word2.substring(1));
        }
        int i,u,d;
        i = minDistance(word1, word2.substring(1));
        d = minDistance(word1.substring(1), word2);
        u = minDistance(word1.substring(1), word2.substring(1));
        
        return min(i,u,d) + 1;
    }
    
    private int min(int x, int y, int z) {
        x = Math.min(x,y);
        return Math.min(x,z);
    }
}
