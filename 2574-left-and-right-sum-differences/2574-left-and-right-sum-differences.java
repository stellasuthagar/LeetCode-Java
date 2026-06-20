class Solution {
    public int[] leftRightDifference(int[] nums)
     {
        int n=nums.length;
        int []ls=new int[n];
        int []rs=new int[n];
        for(int i=0;i<n;i++)
        {
            int l=0,r=0;
            for(int j=0;j<n;j++)
            {
                if(j<i)
                {
                    l+=nums[j];
                }
                else if(j>i)
                {
                    r+=nums[j];
                }
            }
            ls[i]=l;
            rs[i]=r;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=Math.abs(ls[i]-rs[i]);
        }
        return nums;
    }
}