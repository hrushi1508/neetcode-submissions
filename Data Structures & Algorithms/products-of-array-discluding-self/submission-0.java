class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        boolean hasOneZero = false;
        boolean hasTwoZero = false;
        for(int i:nums){
            if(hasOneZero && i==0){
                hasTwoZero = true;
            }
            if(i==0){
                hasOneZero = true;
            }else
                prod*=i;
        }
        int res[] = new int[nums.length];
        if(hasTwoZero){
            return res;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && hasOneZero){
                res[i] = 0;
            }else if(nums[i]==0){
                res[i] = prod;
            }else{
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
