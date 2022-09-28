import java.util.Arrays;
import java.lang.Math;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int count=nums[0];
        for(int i=1 ; i<nums.length ;i++)
        {
            sum = Math.max( sum+nums[i], nums[i]);
            count = Math.max(sum , count);
        }
        return count;
    }
}