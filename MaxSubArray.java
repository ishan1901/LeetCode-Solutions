public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int maximumSum = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            if (sum < 0 && nums[i] > sum) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            maximumSum = Math.max(maximumSum, sum);
        }
        return maximumSum;
    }
}
