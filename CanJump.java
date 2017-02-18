public class CanJump {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int destination = nums.length - 1;
        int position = 0;
        int jump = nums[0];
        while (position <= destination && jump > 0) {
            position++;
            jump--;
            if (position <= destination && jump <= nums[position]) {
                jump = nums[position];
            }
        }
        if (position >= destination) {
          return true;
        } 
        return false;
        
    }
}
