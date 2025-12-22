class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] arr = new int [len*2];
        int length = arr.length;
        int i = 0, j = 0;
        while(i<length)
        {
            if(j == len)
            {
                j = 0;
            }
            arr[i] = nums[j];
            i++; 
            j++;
        }
        return arr;
    }
}