class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if(jewels == null)
            return 0;
        List<Character> list = new ArrayList<>();     
        int len = jewels.length();
        int len1 = stones.length();
        int count = 0;
        for(int i = 0; i<len; i++)
            {
                list.add(jewels.charAt(i));
            }
        for(int i = 0; i<len1; i++)
            {
                if(list.contains(stones.charAt(i)))
                    count++;
            }
        return count;
    }
}