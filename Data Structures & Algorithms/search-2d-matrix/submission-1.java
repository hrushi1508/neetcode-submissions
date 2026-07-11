class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][n-1]>=target){
                int lb = 0;
                int ub = n-1;
                while(lb<=ub){
                    int mid = lb+((ub-lb)/2);
                    if(matrix[i][mid]==target){
                        return true;
                    }else if(matrix[i][mid]>target){
                        ub = mid-1;
                    }else{
                        lb = mid+1;
                    }
                }
            }
        }
        return false;
    }
}
