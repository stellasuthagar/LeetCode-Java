class Solution {
    public boolean checkDivisibility(int n)
     {
        int s=0,p=1;
        int a=n;
        while(a!=0)
        {
            int t=a%10;
            a/=10;
            s+=t;
            p*=t;
        }
        return n%(p+s)==0;
    }
}