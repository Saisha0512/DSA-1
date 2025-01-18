import java.util.ArrayList;

public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n) {
            return -1;
        }

        int low = arr.get(0);
        int high = 0;

        for (int i = 0; i < arr.size(); i++) {
            high += arr.get(i); 
            low = Math.max(low, arr.get(i));
        }
      //low represents the minimum number of pages a student can read
      //high represents the maximum number of pages a student can read
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int studentsRequired = 1;
            int currentSum = 0;

            boolean flag = false;
            for (int i = 0; i < arr.size(); i++) {
                if (currentSum + arr.get(i) > mid) {
                    studentsRequired++;
                    currentSum = arr.get(i);
                    if (studentsRequired > m) {
                        flag = true;
                        break;
                    }
                } else {
                    currentSum += arr.get(i);
                }
            }

            if (flag) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }
}
