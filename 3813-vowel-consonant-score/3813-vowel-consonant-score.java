class Solution {
    public int vowelConsonantScore(String s)
     {
        int v=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a>='a' && a<='z')
            {
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
            {
                v++;
            }
            else 
            {
                c++;
            }
            }
        }
        if(c>0)
        {
            return (int)Math.floor(v/c);
        }
        return 0;
    }
}