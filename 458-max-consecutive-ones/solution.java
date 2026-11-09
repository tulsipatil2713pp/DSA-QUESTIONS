class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int inc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxCount++;
            } 
             else {
                maxCount = 0;
            }
            if (maxCount > inc) {
                inc = maxCount;

        }
    }
        return inc;
    }
};
