class Solution {
    public int[] concatWithReverse(int[] nums) 
    {
        int n=nums.length;
        int []a= new int[n*2];
        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
            a[n*2-i-1]=nums[i];
        }
        return a;
    }
}