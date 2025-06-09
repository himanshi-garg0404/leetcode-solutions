// Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array
// Pattern: Two Pointers
// Topic: Array
// Difficulty: Easy
// Time: O(n)
// Space: O(1)

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        //Step 1: Setup the pointer -> location of unique element 
        int writePointer = 0;

        //Step 2: Start scanning each element
        for(int readPointer = 1; readPointer < nums.length; readPointer++){

            //Step 3: Compare the elements - if not same - found a unique element
            if(nums[writePointer] != nums[readPointer]){
                //Step 4: Go to the next index 
                writePointer++;

                //Step 5: copy the unique element found
                nums[writePointer] = nums[readPointer];
            }
        }
        return writePointer+1;
    }
}