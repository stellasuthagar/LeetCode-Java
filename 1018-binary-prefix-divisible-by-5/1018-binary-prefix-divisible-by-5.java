class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums)
     {
        List<Boolean> l=new ArrayList<>();
        int p=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            p=((p<<1)+nums[i])%5;
            l.add(p==0);
        }
        return l;
    }
}