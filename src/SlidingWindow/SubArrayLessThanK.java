package SlidingWindow;

public class SubArrayLessThanK {

    static void max(int[] nums, int k) {

        int n = nums.length;

        int total = 0;

        for (int i = 0; i < n; i++) {

            int prod = 1;   // reset for each start

            for (int j = i; j < n; j++) {

                prod *= nums[j];

                if (prod < k) {
                    total++;
                } else {
                    break; // no need to continue
                }
            }
        }

        System.out.println(total);
    }

    public static void main(String[] args) {

        int[] arr =
                {10,5,2,6};

        int k = 100;

        max(arr, k);
    }
}