class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==1) return 0;
        int left[] = new int[n];
        int right[] = new int[n];
        int lmax = height[0];
        int rmax = height[n-1];
        int res = 0;
        for(int i=0;i<n;i++){
            left[i] = Math.max(height[i],lmax);
            lmax = left[i];
            int j = n-i-1;
            right[j] = Math.max(height[j],rmax);
            rmax = right[j];    
        }
        for(int i=0;i<n;i++){
            int temp = Math.min(left[i],right[i])-height[i];
            if(temp>0){
                res+=temp;
            }
        }
        return res;
    }
}
