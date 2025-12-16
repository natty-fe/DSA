class Solution {
    public int findClosestNumber(int[] nums) {
        int initial = nums[0];
        int size = nums.length;
        for(int i = 1; i<size; i++)
        {
            if(Math.abs(nums[i]) < Math.abs(initial))
            {
                initial = nums[i];
            }
            if(Math.abs(nums[i]) == Math.abs(initial))
            {
                initial = Math.max(nums[i], initial);
            }
        }
        return initial;
    }
}