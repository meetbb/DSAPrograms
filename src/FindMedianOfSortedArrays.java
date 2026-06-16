public class FindMedianOfSortedArrays {
    public double findMedianOfSortedArrays(int[] num1, int[] num2) {

        // First of all check if the second array is larger, then swap both input arrays and call the function iteratively.
        if (num1.length < num2.length) {
            return findMedianOfSortedArrays(num2, num1);
        }

        // Save the length of both arrays in one variable.
        int m = num1.length;
        int n = num2.length;

        // Now, we need to find the lowest and highest value among arrays
        int low = 0;
        int high = m;

        while (low <= high) {
            int partition1 = (low + high) / 2;
            int partition2 = (m + n + 1) / 2;

            // Since we have two partitions, now we need to find the lMax1, lMax2, rMin1, rMin2
            int leftMax1 = (partition1 == 0) ? Integer.MIN_VALUE : num1[partition1 - 1];
            int leftMax2 = (partition2 == 0) ? Integer.MIN_VALUE : num2[partition2 - 1];
            int rightMin1 = (partition1 == m) ? Integer.MAX_VALUE : num1[partition1];
            int rightMin2 = (partition2 == n) ? Integer.MAX_VALUE : num2[partition2];

            if (leftMax1 <= rightMin2 && leftMax2 <= rightMin1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(leftMax1, leftMax2) + Math.min(rightMin1, rightMin2)) / 2.0;
                }
                return Math.max(leftMax1, leftMax2);
            } else if (leftMax1 > rightMin2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }

        return 0;
    }
}
