class Solution {
    public int reverse(int x)
    {
        int r=0;
        int a=x;
        while(a!=0)
        {
            int t=a%10;
            a/=10;
            if(r>Integer.MAX_VALUE/10 || r==Integer.MAX_VALUE/10 && t>7)
            {
                return 0;
            }
            if(r<Integer.MIN_VALUE/10 || r==Integer.MIN_VALUE/10 && t<-8)
            {
                return 0;
            }
            r=t+r*10;
        }
        
        return r;
    }
}