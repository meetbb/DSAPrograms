import java.util.Arrays;

public class MaximumTastinessSolution {
    // Suppose we have an array price = [13,5,1,8,21,2], k = 3
    public int maximumTastiness(int[] prices, int k) {
        // First of all we sort the array
        Arrays.sort(prices);
        // The array becomes [1, 2, 5, 8, 13, 21]
        // Now let's take the left, right and answer variable
        int left = 0;
        int right = prices[prices.length - 1] - prices[0]; // Which is 21 - 1 = 20
        int ans = 0;

        while (left <= right) {
            System.out.println("Binary left is: " + left);
            System.out.println("Binary right is: " + right);
            int mid = left + (right - left) / 2; // 11 + (20 - 11) / 2 = 10
            System.out.println("Binary mid is: " + mid);
            if (canPick(prices, k, mid)) { // true
                ans = mid; // ans = 10
                left = mid + 1; // left = 11
                System.out.println("Binary if ans is: " + ans);
                System.out.println("Binary if left is: " + left);
            } else {
                System.out.println("Binary right in else is: " + right);
                right = mid - 1;
            }
        }
        return ans;
    }

    // Greedy check: can we pick k candies with min diff >= gap?
    private boolean canPick(int[] price, int k, int gap) {
        int count = 1; // first candy always picked
        int lastPicked = price[0]; // First of all pick the first candy
        System.out.println("Greedy Count is: " + count);
        System.out.println("Greedy lastPicked is: " + lastPicked);
        System.out.println("Greedy Gap is: " + gap);

        for (int i = 1; i < price.length; i++) {
            System.out.println("Greedy value at i: " + i + " is: " + price[i]);
            System.out.println("Greedy price[i] - lastPicked >= gap is: " + (price[i] - lastPicked >= gap));
            if (price[i] - lastPicked >= gap) { // 21 - 1 >= 10 true
                count++; // Count = 3
                lastPicked = price[i]; // 21
                if (count == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
