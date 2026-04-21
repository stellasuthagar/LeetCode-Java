class Solution {
    public int countDigitOccurrences(int[] nums, int digit)
     {
        int c=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
           int m=nums[i];
           while(m!=0)
           {
            int t=m%10;
            m/=10;
            if(t==digit)
            {
                c++;
            }
           }
        }
        return c;
    }
}