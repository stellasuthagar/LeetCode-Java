class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        int c = 0, d = 0;

        if (length >= 10000 || width >= 10000 || height >= 10000 ||
            (long) length * width * height >= 1000000000L) {
            c++;
        }

        if (mass >= 100) {
            d++;
        }

        if (c == 1 && d == 1)
            return "Both";
        else if (c == 1)
            return "Bulky";
        else if (d == 1)
            return "Heavy";
        else
            return "Neither";
    }
}