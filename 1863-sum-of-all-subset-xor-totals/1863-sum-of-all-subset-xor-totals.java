class Solution {
    int ans = 0;

    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0);
        return ans;
    }

    private void dfs(int[] nums, int index, int xor) {
        if (index == nums.length) {
            ans += xor;
            return;
        }

        // Don't take current element
        dfs(nums, index + 1, xor);

        // Take current element
        dfs(nums, index + 1, xor ^ nums[index]);
    }
}