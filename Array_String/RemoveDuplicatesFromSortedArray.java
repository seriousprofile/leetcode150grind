class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1; //every first element of an array is considered to be unique.
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i - 1]){ //if current ele is not equal to prev ele, it is unique.
                nums[j] =  nums[i]; 
                j++;
            } //if the previous element was the same, j wouldnt increment. i would increment, and check for the next number, and if it is unique, it replaces the previous number that is repeated.
        }
        return j;
    }
}
