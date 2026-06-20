class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] a = new int[n];
        int less = 0, equal = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) less++;
            else if (nums[i] == pivot) equal++;
        }

        int l = 0;               
        int m = less;            
        int r = less + equal;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                a[l++] = nums[i];
            } else if (nums[i] == pivot) {
                a[m++] = nums[i];
            } else {
                a[r++] = nums[i];
            }
        }

        return a;
    }
}