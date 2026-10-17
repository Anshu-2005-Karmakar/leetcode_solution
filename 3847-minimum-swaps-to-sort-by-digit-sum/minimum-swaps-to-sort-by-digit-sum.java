import java.util.Arrays;

class Solution {
    public int minSwaps(int[] nums) {
        int sum[] = new int[nums.length];

        // Your original digit-sum code — unchanged
        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            int temp = nums[i];

            while (temp != 0) {
                int r = temp % 10;
                s = s + r;
                temp /= 10;
            }

            sum[i] = s;
        }

        // NEW: Store original indices
        Integer order[] = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            order[i] = i;
        }

        // NEW: Sort indices by digit sum, then by number
        Arrays.sort(order, (a, b) -> {
            if (sum[a] != sum[b]) {
                return Integer.compare(sum[a], sum[b]);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        // NEW: Count minimum swaps
        boolean visited[] = new boolean[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = order[j];
                cycleSize++;
            }

            if (cycleSize > 1) {
                count += cycleSize - 1;
            }
        }

        return count;
    }
}