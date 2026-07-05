class Solution {
    public boolean isMiddleElementUnique(int[] nums) 
    {
        int n= nums.length,ans=nums[n/2];
        if(n==1)
        {
            return true;
        }
        boolean h=true;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==ans && i!=n/2)
            {
                return false;
            }
        }
        return true;
    }
}