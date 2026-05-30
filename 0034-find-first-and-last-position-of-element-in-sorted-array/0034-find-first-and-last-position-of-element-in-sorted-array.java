class Solution {
    public int[] searchRange(int[] nums, int t) 
    {
        int f=-1,ll=-1;
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(nums[m]==t)
            {
                f=m;
                r=m-1;
            }
            else if(nums[m]<t)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        l=0;r=nums.length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(nums[m]==t)
            {
                ll=m;
                l=m+1;
            }
            else if(nums[m]<t)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        return new int[]{f,ll};
    }
}