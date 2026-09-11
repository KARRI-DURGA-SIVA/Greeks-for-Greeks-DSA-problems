import java.util.ArrayList;

class Solution {

    int[] getDigitDiff1AndLessK(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            if (num < k && num >= 10) {
                boolean isValid = true;
                int temp = num;

                while (temp >= 10) {
                    int lastDigit = temp % 10;
                    temp = temp / 10;
                    int nextDigit = temp % 10;

                    if (Math.abs(lastDigit - nextDigit) != 1) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    list.add(num);
                }
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
