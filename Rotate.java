public class Rotate {

    // solution 1
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1 || nums.length == k || k == 0) {
            return;
        }
        if (k > nums.length) { k = k % nums.length; }
        Deque<Integer> stack = new ArrayDeque<>();
        int i;
        for (i = nums.length - 1; i >= nums.length - k; i--) {
            stack.push(nums[i]);
        }
        int l = nums.length - 1;
        for (int j = i; j >= 0 ; j--) {
            swap(nums, j, l);
            l--;
        }
        i = 0;
        while(!stack.isEmpty()) {
            nums[i] = stack.pop();
            i++;
        }
        
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    // solution 2
    public void rotate2(int[] nums, int k) {
        if (k > nums.length) { k = k % nums.length; }
        if(nums.length <= 1 || nums.length == k || k == 0) {
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        

    }
    
    public void reverse(int[] nums, int a, int b) {
        int length = b - a;
        for (int i = 0; i <= length/2; i++) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            b--;
            a++;
        }
    }
}
