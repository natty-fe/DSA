class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int [] count = new int [len+1];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++)
        {
            count[nums[i]]++;
        }
        for(int i = 1; i <= len; i++)
        {
            if(count[i] == 0)
                list.add(i);
        }
        return list;
    }
}