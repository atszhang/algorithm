public class L4AMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int index1 = 0;
        int index2 = 0;
        if (nums1.length == 0) {
            ans = nums2[nums2.length / 2];
            if (nums2.length % 2 == 0) {
                ans = (ans + nums2[(nums2.length / 2) - 1]) / 2;
            }
            return ans;
        }
        if (nums2.length == 0) {
            ans = nums1[nums1.length / 2];
            if (nums1.length % 2 == 0) {
                ans = (ans + nums1[(nums1.length / 2) - 1]) / 2;
            }
            return ans;
        }
        int n = (nums1.length + nums2.length) / 2;
        n += (nums1.length + nums2.length) % 2;
        for (int i = 0; i < n; i++) {
            if (index1 == nums1.length) {
                ans = nums2[index2];
                index2++;
            } else if (index2 == nums2.length) {
                ans = nums1[index1];
                index1++;
            } else {
                if (nums1[index1] < nums2[index2]) {
                    ans = nums1[index1];
                    index1++;
                } else {
                    ans = nums2[index2];
                    index2++;
                }
            }
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            int temp;
            if (index1 == nums1.length) {
                temp = nums2[index2];
            } else if (index2 == nums2.length) {
                temp = nums1[index1];
            } else {
                temp = Math.min(nums1[index1], nums2[index2]);
            }
            ans = (ans + temp) / 2;
        }

        return ans;
    }
}
