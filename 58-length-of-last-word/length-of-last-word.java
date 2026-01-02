class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int len = s.length();
        for(int i = len-1; i >= 0; i--)
        {
            char c = s.charAt(i);
            if(c != ' ') count++;
            else if(count > 0 && c == ' ') return count;
        }
        return count;
    }
}