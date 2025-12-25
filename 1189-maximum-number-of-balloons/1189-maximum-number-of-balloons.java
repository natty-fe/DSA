class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        int i = 0;
        while (i < text.length()) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
            i++;
        }

        int smallestValue = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (key == 'l' || key == 'o') {
                value = value / 2;
            }

            if (value < smallestValue) {
                smallestValue = value;
            }
        }

        return smallestValue;
    }
}
