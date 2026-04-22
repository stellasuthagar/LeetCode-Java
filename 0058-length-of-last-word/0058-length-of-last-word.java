class Solution {
    public int lengthOfLastWord(String s)
     {
        int n=s.length(),c=0,ans=0;
        for(int i=n-1;i>=0;i--)
        {
            if(c==0 && s.charAt(i)==' ')
            {
                continue;
            }
            else if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
        {
            c++;
        }
        else if(c>0 && s.charAt(i)==' ')
        {
            break;
        }


        }
        return c;
    }
}