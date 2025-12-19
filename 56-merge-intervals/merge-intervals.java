class Solution {
    public int[][] merge(int[][] intervals) {

        int length = intervals.length;
        ArrayList<int[]> array = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;
        int end = intervals[0][1];   

        for (int i = 1; i < length; i++) {

            if (end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]); 
            }
            else {
                array.add(new int[]{intervals[start][0], end});
                start = i;
                end = intervals[i][1]; 
            }
        }

        array.add(new int[]{intervals[start][0], end});

        return array.toArray(new int[array.size()][]);
    }
}
