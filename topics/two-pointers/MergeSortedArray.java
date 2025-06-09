// Problem: Merge Sorted Array
// Link: https://leetcode.com/problems/merge-sorted-array/
// Pattern: Two-Pointers
// Topic: Array
// Difficulty: Easy
// Time: O(n)
// Space: O(1)

public class MergeSortedArray {
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

            // Step 1 : Create three pointer 
            int i = m-1; // Point at last index of nums1
            int j = n-1; // point at last index of nums2
            int k = m+n-1; // Point at last index of the result array
    
            //Step 2 : Iterate both arrays
            while(i>=0 && j>=0){
                //Step 3 : if which number is greater 
                if(nums1[i] > nums2[j]){
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                }else{
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            }
    
            //Step : if any elements are left
            while(j>=0){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            
    }
}