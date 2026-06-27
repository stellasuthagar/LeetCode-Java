class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int n = nums.length;

        while (k-- > 0) {
            int minIndex = 0;

            for (int i = 1; i < n; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }

            nums[minIndex] *= m;
        }

        return nums;
    }
}