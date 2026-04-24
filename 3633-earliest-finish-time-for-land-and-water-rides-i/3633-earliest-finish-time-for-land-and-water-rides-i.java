class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) 
    {
        int ans=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++)
        {
            min=Math.min(min,landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<waterStartTime.length;i++)
        {
            ans=Math.min(ans,Math.max(min,waterStartTime[i])+waterDuration[i]);
        }
        min=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++)
        {
            min=Math.min(min,waterStartTime[i]+waterDuration[i]);
        }
        for(int i=0;i<landStartTime.length;i++)
        {
            ans=Math.min(ans,landDuration[i]+Math.max(min,landStartTime[i]));
        }
        return ans;
    }
}