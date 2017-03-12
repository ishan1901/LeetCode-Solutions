public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        return binarySearch(nums, 0, nums.length-1);
    }
    
    private int binarySearch(int[] nums, int start, int end) {
        if(start == end) {
            return start;
        }
        if (start +1 == end) {
            if (nums[start] > nums[end]) {
                return start;
            }
            return end;
        }
        
        int mid = (start + end)/2;
        if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid + 1]) {
            return mid;
        } else if (nums[mid] > nums[mid+1]) {
            return binarySearch(nums, start, mid-1);
        } else {
            return binarySearch(nums, mid+1, end);
        }
    }
}
