class Solution {
    public int countDistinctIntegers(int[] nums) 
    {
        int n=nums.length;
        Set<Integer> h= new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int m=nums[i];
            int m2=0;
            h.add(nums[i]);
            while(m!=0)
            {
                int t=m%10;
                m/=10;
                m2=t+m2*10;
            }
            h.add(m2);
        }
        return h.size();
    }
}