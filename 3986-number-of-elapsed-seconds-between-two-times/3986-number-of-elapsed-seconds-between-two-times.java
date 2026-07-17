class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) 
    {
        String []a= startTime.split(":");
        String []b= endTime.split(":");
        int ans = (Integer.parseInt(a[0])*3600)+(Integer.parseInt(a[1])*60)+Integer.parseInt(a[2]);
        int ans2 = (Integer.parseInt(b[0])*3600)+(Integer.parseInt(b[1])*60)+Integer.parseInt(b[2]);
        return Math.abs(ans-ans2);
    }
}