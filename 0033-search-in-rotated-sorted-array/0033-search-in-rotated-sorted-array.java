class Solution {
    public int search(int[] nums, int t) 
    {
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(nums[m]==t)
            {
                return m;
            }
            if(nums[m]>=nums[l])
            {
                if(t>=nums[l] && t<nums[m])
                {
                    r=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            else
            {
                if(t>nums[m] && t<=nums[r])
                {
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
        }
        return -1;
    }
}