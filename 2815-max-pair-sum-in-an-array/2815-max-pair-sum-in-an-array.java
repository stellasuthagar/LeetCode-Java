class Solution {
    public int maxSum(int[] nums) {
        int[] max1 = new int[10];
        int[] max2 = new int[10]; 

        Arrays.fill(max1, -1);
        Arrays.fill(max2, -1);

        for (int num : nums) {
            int d = getMaxDigit(num);

            if (num > max1[d]) {
                max2[d] = max1[d];
                max1[d] = num;
            } else if (num > max2[d]) {
                max2[d] = num;
            }
        }

        int ans = -1;
        for (int d = 0; d < 10; d++) {
            if (max1[d] != -1 && max2[d] != -1) {
                ans = Math.max(ans, max1[d] + max2[d]);
            }
        }

        return ans;
    }

    private int getMaxDigit(int num) {
        int max = 0;
        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }
}