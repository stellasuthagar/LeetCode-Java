class Solution {
    public long maxPairStrength(int[] nums) 
    {
        long ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                long h=((long)nums[i]*(long)nums[j]);
                long m=gcd(nums[i],nums[j]);
                m*=m;

                ans=Math.max(ans,h/m);
            }

        }
        return ans;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
}