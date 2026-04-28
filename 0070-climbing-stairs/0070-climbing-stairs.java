class Solution {
    public int climbStairs(int n)
     {
        int f1=0,f2=1;
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            ans = f1+f2;
            f1=f2;
            f2=ans;
        }
        return ans;
    }
}