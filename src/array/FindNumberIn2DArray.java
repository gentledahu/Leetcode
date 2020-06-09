public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //对每一行做二分查找
        if(matrix.length==0||matrix==null) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            int low = 0;
            int high = n-1;
            while(low<=high){
                int mid = low+((high-low)>>1);
                if(matrix[i][mid]==target)return true;
                else if(matrix[i][mid]>target){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return false;
    }