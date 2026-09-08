class Solution {
    public int maxDays(int[] arr) {
        int max = 0;

        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}