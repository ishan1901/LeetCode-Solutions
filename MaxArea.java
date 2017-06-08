public class MaxArea {
    public int maxArea(int[] height) {
        int maximumArea = 0, leftPtr = 0, rightPtr = height.length -1;
        while (leftPtr < rightPtr) {
            int indexDiff = rightPtr - leftPtr;
            int value = Math.min(height[rightPtr], height[leftPtr]);
            maximumArea = Math.max(maximumArea, indexDiff * value);
            if (height[leftPtr] < height[rightPtr]) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }
        return maximumArea;
    }
} 
