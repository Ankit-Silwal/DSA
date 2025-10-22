<!-- //41. First Missing Positive
Solved
Hard
Topics
premium lock icon
Companies
Hint
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing. -->

class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,max=0;
        while(i<nums.length){
          int check=nums[i]-1;
          if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[check]){
            int temp=nums[check];
            nums[check]=nums[i];
            nums[i]=temp;
          }else{
            i++;
          }
        }
        for(int j=0;j<nums.length;j++){
          int target=j+1;
          if(nums[j]>max){
            max=nums[j];
          }
          if(nums[j]!=target){
            return target;
          }
        }
        return (max+1);
    }
}