class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        int i = 0, j = n - 1;

        while (i < j) {
            char a = arr[i];
            char b = arr[j];

            if (!isVowel(a)) {
                i++;
            } 
            else if (!isVowel(b)) {
                j--;
            } 
            else {
                arr[i] = b;
                arr[j] = a;
                i++;
                j--;
            }
        }

        return new String(arr);  
    }

    private boolean isVowel(char c) {
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
}