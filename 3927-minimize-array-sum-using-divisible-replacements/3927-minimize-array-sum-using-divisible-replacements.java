class Solution 
{
    public long minArraySum(int[] nums) 
    {
        int n=nums.length;

        TreeMap<Integer,Integer> map=new TreeMap<>();

        int max=0;

        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,nums[i]);
        }

        long sum=0;

        for(int i:map.keySet())
        {
            if(map.get(i)>0)
            {
                for(int j=i;j<=max;j+=i)
                {
                    if(map.containsKey(j) && map.get(j)>0)
                    {
                        sum+=(long)map.get(j)*i;
                        map.put(j,0);
                    }
                }
            }
        }

        return sum;
    }
}