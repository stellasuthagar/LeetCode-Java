class Solution {
    public int countPartitions(int[] nums) 
    {
        int sum=0,c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int s1=0;
            sum+=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                s1+=nums[j];
            }
            if(Math.abs(s1-sum)%2==0)
            {
                c++;
            }
        }
        return c;
    }
}