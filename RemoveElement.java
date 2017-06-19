public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] != val) {
                i++;
            } else if (nums[j] == val){
                j--;
            } else {
                nums[i] = nums[j];
                i++; j--;
            }
        }
        return i;
    }
}
