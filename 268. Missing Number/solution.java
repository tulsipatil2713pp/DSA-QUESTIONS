class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n= nums.length;
        int sum1 = n * (n + 1) / 2;
         for (int i=n-1;i>=0;i--) {
          sum += nums[i];
        }
        return sum1-sum;
    }
}
