class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "" ;
        int i=0;
        while(true)
        {
            int length1 = word1.length();
            int length2 = word2.length();
            int peak = Math.max(length1, length2);
            if(i == peak)
            {
                return merged;
            }
            if(i < length1)
            {
                merged += word1.charAt(i);    
            }
            if(i < length2)
            {
                merged += word2.charAt(i);
            }
            i++;
        }
    }
}