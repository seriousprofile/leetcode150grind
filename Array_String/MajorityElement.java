class Solution {
    public int majorityElement(int[] nums) {
        //any element that repeats more than n/2 times is considered to be the most repeated element which occupies the middle position in any array. 
        Arrays.sort(nums);
        int n = nums.length; 
        return nums[n/2];
    }
}
