import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        for(int i : nums){
            int sum = nums[left]+nums[right];
            if(sum == target)
                return new int[]{left+1,right};
            else if(sum > target)
                right--;
            else
                left++;
        }
        return new int[]{0,0};
    }
}