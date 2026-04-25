class Solution {
    public char nextGreatestLetter(char[] letters, char target)
     {
        char b=' ';
        Arrays.sort(letters);
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
            {
                b=letters[i];
                break;
            }
        }
        if(b==' ')
        {
            b=letters[0];
        }
        return b;
    }
}