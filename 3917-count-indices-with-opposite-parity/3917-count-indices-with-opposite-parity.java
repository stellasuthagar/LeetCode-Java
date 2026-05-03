class Solution {
    public int[] countOppositeParity(int[] nums) 
    {
        int n=nums.length;
        if(n==1)
        {
            nums[0]=0;
            return nums;
        }

        int []a= new int[n];
        Arrays.fill(a,0);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]%2==0 && nums[j]%2==1)
                {
                    a[i]++;
                }
                else if(nums[i]%2==1 && nums[j]%2==0)
                {
                    a[i]++;
                }
            }
        }
     return a;
    }
}