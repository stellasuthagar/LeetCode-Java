class Solution {
    public boolean validDigit(int n, int x)
    {
        int a = n;
        boolean f1 = false;
        int first = 0;

        while(a != 0)
        {
            int t = a % 10;
            
            if(t == x)
            {
                f1 = true;
            }

            first = t; 
            a /= 10;
        }

        if(f1 && first != x)
        {
            return true;
        }
        return false;
    }
}