import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
	        if (nums.length < 2) {
	            return result;
	        }
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (!map.containsKey(nums[i])) {
	                map.put(nums[i], i);
	            }      
	            int value = target - nums[i];
	            
	            if (map.containsKey(value)) {
	                if (i == map.get(value)) {
	                    continue;
	                } else if (i > map.get(value)) {
	                    result[0] = map.get(value);
	                    result[1] = i;
	                } else {
	                    result[0] = i;
	            	    result[1] = map.get(value);                    
	                }
	                break;
	            }
	        }
	        return result;
	}
}
