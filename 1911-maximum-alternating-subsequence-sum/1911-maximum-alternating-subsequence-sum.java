class Solution {
    public long maxAlternatingSum(int[] nums)
     {
        long odd=0,even=0;
        for(int x : nums)
        {
            even=Math.max(even,odd+x);
            odd=even-x;
        }
        return even;
    }
}