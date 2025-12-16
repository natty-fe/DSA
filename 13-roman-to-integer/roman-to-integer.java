class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int size = s.length();
        int numeral = map.get(s.charAt(size-1));
        int j = 1;
        for(int i = size-2; i>=0; i--)
        {
            char x = s.charAt(size-j);
            if(map.get(x)<=map.get(s.charAt(i)))
            {
                numeral += map.get(s.charAt(i));
            }
            else
            {
                numeral -= map.get(s.charAt(i));
            }
            j++;
        }
        return numeral;
    }
}