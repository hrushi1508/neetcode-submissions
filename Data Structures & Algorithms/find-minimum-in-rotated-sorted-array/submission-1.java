class Solution {
    public int findMin(int[] nums) {
        int lb = 0;
        int ub = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(lb<=ub){
            int mid = lb+((ub-lb)/2);
            if(nums[mid]>=nums[lb]){
                ans = Math.min(ans,nums[lb]);
                lb = mid+1;
            }else{
                ans = Math.min(ans,nums[mid]);
                ub = mid-1;
            }
        }
        return ans;
    }
}
