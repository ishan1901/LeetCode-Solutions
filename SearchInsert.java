public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int i = nums.length - 1;
        while (i >= 0 && target < nums[i]) {i--;}
        if (i >= 0 && nums[i] == target) return i;
        return i + 1;
    }
}
