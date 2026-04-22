class Solution {
    public int gcdOfOddEvenSums(int n) 
    {
        int od=(int)(n*n)/n;
        int ev=(int)(n*(n+1))/n;
        if(od==ev-1)
        {
            return n;
        }
        return 1;
    }
}