class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0) return new int[0];
        int left = 0;
        int right = matrix[0].length-1;
        int up = 0;
        int down = matrix.length-1;
        int[] res = new int[(right+1)*(down+1)];
        int x = 0;
        while(true){
            for(int i=left;i<=right;i++){
                res[x++] = matrix[up][i];
            }
            if(++up>down) break;
            for(int i=up;i<=down;i++){
                res[x++] = matrix[i][right];
            }
            if(left>--right) break;
            for(int i=right;i>=left;i--){
                res[x++] = matrix[down][i];
            }
            if(up>--down) break;
            for(int i=down;i>=up;i--){
                res[x++] = matrix[i][left];
            }
            if(++left>right) break;
        }
        return res;
    }
}