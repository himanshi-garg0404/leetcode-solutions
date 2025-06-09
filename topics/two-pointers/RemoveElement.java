// Problem: Remove Element
// Link: https://leetcode.com/problems/remove-element/
// Pattern: Two Pointers
// Topic: Array
// Difficulty: Easy
// Time: O(n)
// Space: O(1)

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0 ; // Index which we need to wverwrite the value
        //Step 1: iterate through each element of the nums array 
        for(int i=0; i<nums.length; i++){
            //Step2 :checks whether the current element nums[i] is equal to the specified val.
            if(nums[i] != val){
                nums[k] = nums[i]; //Overwrite
                k++; //Update the pointer to overwrite to next 
            }
        }
        return k;
    }
}
