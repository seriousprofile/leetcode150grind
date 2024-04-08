class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // default index of arr is set to 0.
        for (int i = 0; i < nums.length; i++){ //traverse thru the array
            if (nums[i] != val){ //if the number at a certain index is not equal to the value, 
                nums[index] = nums[i]; //add it to the first index instead
                index++; //dont forget to increase the count!
            }
        }
        return index; //return the count which is basically the answer asked in the question. 
    }
}
