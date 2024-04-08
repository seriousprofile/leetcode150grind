class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //pointer for nums 1 
        int j = n - 1; //pointer for nums 2 
        int k = m + n - 1; // pointer for merged sorted array

        while (j >= 0){ 
            if (i >= 0 && nums1[i] > nums2[j]){ //pointer i should always be greater than 0 to ignore the 0s so it starts from nonzero number sorting
                nums1[k] = nums1[i]; //k here refers to the zero spaces that will be filled by the greatest element.
                k--; //we traverse the array backwards because of sorting in the descending order. 
                i--;
            }
            else {
                nums1[k]= nums2[j]; //if nums2[j] > nums1[i], place the largest element of nums2 in nums1.
                k--;
                j--;
            }
        }
    }
}
