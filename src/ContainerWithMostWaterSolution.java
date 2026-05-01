public class ContainerWithMostWaterSolution {

    // Practice Count: 3
    public int maxWater(int[] height) {
        // First take a max variable, with left and right pointer
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        // Iterate until the left is smaller than right
        while (left<right) {
            // Find Width between left and right pointer
            int width = right - left;
            // Find area between two pointers value
            int area = Math.min(height[left], height[right]) * width;
            // Reason we took the minimum value is because we need the area
            // Now assign this value to max if area is greater than existing max value
            max = Math.max(max, area);
            // if the left pointer is smaller than right the increment the left pointer
            // or else decrement the right pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
