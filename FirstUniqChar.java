public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int[] map = new int[128];
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            map[array[i]]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (map[array[i]] == 1) { 
                return i;
            }
        }
        return -1;
    }
}
