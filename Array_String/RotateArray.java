class Solution {
    public void reverse(int[] nums, int s, int e){ //for reversing the array first:
        int n = nums.length; 
        while(s < e){ //as long as the starting ele is lesser than the ending ele (given that the array is arranged in an ascending order), the loop will run.
            int temp = nums[s]; //assign ele at the starting index to a temp variable 
            nums[s] = nums[e]; //now that the starting index is empty, move the ending ele to the starting index.
            nums[e] = temp; //assign the value of temp (aka, the starting element that we added to temp variable) to the last index as it is now empty.
            s++; //starting index moves to the next index.
            e--; //ending index moves to the previous index.
        }
    } 
        
    public void rotate(int[] nums, int k) {
        int n = nums.length; 
        k = k % n; //even if k > n, it ensures that the array moves by only k % n positions without causing an error.
        reverse(nums, 0, n - 1); //reverse the nums array, starting index is 0, ending index is last ele's index. we use this to reverse the entire array.
        reverse(nums, 0, k - 1); //this is to reverse the subarrays. first reverse the k number of elements. we use k-1 however because of array's 0 indexing.
        reverse(nums, k, n -1); //this is to reverse the rest of the subarray. reverse the rest of the elements starting from k to the last ele which is n - 1.
    }
}
