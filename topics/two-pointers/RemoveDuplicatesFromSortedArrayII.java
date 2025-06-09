// Problem: Remove Duplicates from Sorted Array II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Pattern: TODO
// Topic: Array
// Difficulty: Medium
// Time: TODO
// Space: TODO

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {

        //Step 1: Return the length if the nums of elements in teh array are only 2
        if (nums.length == 2){
            return nums.length;
        }
        //Step 2: Setup the pointer - start at 2 because the previous 2 elemts need to be kept  
        int writePointer = 2;

        //Step 3: Start scanning each element
        for(int readPointer = 2; readPointer < nums.length; readPointer++){

            //Step 3: Compare the current elements 
            if(nums[readPointer] != nums[writePointer-2]){
                //Step 5: copy the unique element found
                nums[writePointer] = nums[readPointer];

                //Step 4: Go to the next index 
                writePointer++;

              
            }
        }
        return writePointer;
    }
}