class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<=n;i++){
            
            while(!stk.isEmpty() && (i==n || heights[stk.peek()]>heights[i])){
                int height = heights[stk.pop()];
                int width = stk.isEmpty()? i:i-stk.peek()-1;
                maxArea = Math.max(maxArea,height*width);
            }
            // push the current ele into stack;
            stk.push(i);
        }
        return maxArea;
    }
}
