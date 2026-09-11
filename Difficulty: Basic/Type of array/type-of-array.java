class Solution {
    int typeOfArr(int arr[]) {
        int n = arr.length;

        int asc = 0;
        int desc = 0;

        int ascIndex = -1;
        int descIndex = -1;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;

            if (arr[i] < arr[next]) {
                asc++;
                ascIndex = i;
            } else {
                desc++;
                descIndex = i;
            }
        }

        // Ascending array or ascending rotated
        if (desc == 1) {
            if (descIndex == n - 1)
                return 1;
            else
                return 4;
        }

        // Descending array or descending rotated
        if (asc == 1) {
            if (ascIndex == n - 1)
                return 2;
            else
                return 3;
        }

        return -1;
    }
}