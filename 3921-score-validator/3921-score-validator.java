class Solution 
{
    public int[] scoreValidator(String[] events) 
    {
        int[] a = new int[2];

        int score = 0;
        int counter = 0;

        for(int i = 0; i < events.length; i++)
        {
            if(counter == 10)
            {
                break;
            }

            if(events[i].equals("WD") || events[i].equals("NB"))
            {
                score += 1;
            }
            else if(events[i].equals("W"))
            {
                counter += 1;
            }
            else
            {
                score += Integer.parseInt(events[i]);
            }
        }

        a[0] = score;
        a[1] = counter;

        return a;
    }
}