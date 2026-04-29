class Solution {
    public int mostWordsFound(String[] s)
     {
        int ans=0;
        for(int i=0;i<s.length;i++)
        {
            String h=s[i];
            String [] b= h.split(" ");
            ans=Math.max(ans,b.length);
        }
        return ans;
    }
}