class Solution {
    public int removeDuplicates(int[] nums) {
        //we use two pointer approach: pointer j for comparing to check element recurrences, and pointer i for traversing through the array to check with j.
        int j = 1; // the first element in an array is always assumed to be unique. so instead of 0
                   // index, we go to 1.
        for (int i = 1; i < nums.length; i++) { // for the same reason, i pointer also starts from index 1.
            if (j == 1 || nums[i] != nums[j - 2]) { //j - 2 is used to check the ele 2 positions behind. if they exist, then the current ele cannot be considered. 
                nums[j++] = nums[i]; //current ele is added to incremented j position.
            }
        }

        return j;

    }
}
