public class Rotate {

    // solution 1
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1 || nums.length == k) {
            return;
        }
        if (k > nums.length) { k = k % nums.length; }
        Deque<Integer> stack = new ArrayDeque<>();
        int i;
        for (i = nums.length - 1; i > k; i--) {
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
}
