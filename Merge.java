public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = nums1.length - 1, j = n - 1, k = m -1;
        while (j >= 0 && i >= 0) {
            if (k >= 0 && nums1[k] >= nums2[j]) {
                nums1[i] = nums1[k];
                k--;
            } else {
                nums1[i] = nums2[j];
                j--;
            }
            i--;
        }
    }
}
