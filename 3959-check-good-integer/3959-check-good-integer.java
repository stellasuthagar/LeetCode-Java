class Solution {
    public boolean checkGoodInteger(int n) 
    {
        int p=0,s=0,ans=0;
        while(n!=0)
        {
             s+=(n%10);
             p+=(n%10)*(n%10);
             n/=10;
        }
        ans=Math.abs(p-s);
        return (ans>=50);
    }
}