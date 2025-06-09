// Problem: Maximum Average Subarray I
// Link: https://leetcode.com/problems/maximum-average-subarray-i/
// Pattern: sliding-window
// Topic: Array
// Difficulty: Easy
// Time: O(n)
// Space: O(1)

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        
        // //Brute Force - Solution
        // double maxAvg = Double.NEGATIVE_INFINITY; 

        //  // start from the begining ang go upto n-k
        //  for(int i = 0; i <= nums.length-k; i++){
        //      int sum = 0;

        //      //iterate over the sub array 
        //      for(int j = i ; j< i+k; j++){
        //          sum += nums[j];
        //      }
        //      // calculate the average of the. subarray
        //     double avg = (double)sum/k;

        //       // check max average 
        //       if(avg>=maxAvg){
        //          maxAvg = avg;
        //       }
        // }
        // return maxAvg;



        //Step 1 : Calculate the sum of the starting window
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
        }

        //Step 2 : Store the start and end index of the window 
        int startIndex = 0;
        int endIndex = k;
        int maxSum = sum;

        //Step 3 : Slide the window till the end index reaches the end of the array
        while(endIndex < nums.length){
           //Step 4 : To calculate the sum the start index from sum and add the end index
           sum -= nums[startIndex];
           sum += nums[endIndex];

          //Step 5 : Increment the start index and the end index for next window
          startIndex++;
          endIndex++;

          // Step 6 : check max average 
          if(sum>=maxSum){
                maxSum = sum;
          }
        }

        double maxAvg = (double) maxSum/k;
        return maxAvg;

    }
}