public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int T[] = new int[nums.length];
        Arrays.fill(T, 1);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    T[i] = Math.max(T[j]+1, T[i]);
                }
                
            }
        }
        for(int i = 0; i < T.length; i++) {
            max = Math.max(max, T[i]);
        }
        return max;
    }
}
