package TwoPointer;

public class LT_88 {

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;          // last valid element in nums1
        int j = n - 1;          // last element in nums2
        int k = m + n - 1;      // last position of nums1

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        return nums1;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 7, 11, 15, 0, 0, 0, 0};
        int[] arr2 = {3, 5, 8, 10};

        merge(arr1, 4, arr2, 4);

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}