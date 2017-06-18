public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {return "";}
        String max = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < max.length() && j < strs[i].length() && max.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            max = max.substring(0,j);
        }
        return max;
    }
}
