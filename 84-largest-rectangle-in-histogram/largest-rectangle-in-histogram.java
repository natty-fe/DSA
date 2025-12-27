class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] left = new int [heights.length];
        int[] right = new int [heights.length];
        int max = 0;
        for(int i = 0; i < heights.length; i++)
        {
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                left[i] = 0;
            }
            else
            {
                left[i] = stack.peek()+1;
            }
            stack.push(i);
        }
        stack.clear();
        for( int i = heights.length-1; i >= 0; i--)
        {
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                right[i] = heights.length-1;
            }
            else
            {
                right[i] = stack.peek()-1;
            }
            stack.push(i);
        }
        for(int i = 0; i < heights.length; i++)
        {
            max = Math.max(max, ((right[i]-left[i])+1)*heights[i]);
        }
        return max;
    }
}