class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,words,i,j,0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,char[] words,int i,int j,int len){
        if(i>=board.length||i<0||j>=board[0].length||j<0||board[i][j]!=words[len]) return false;
        if(len==words.length-1) return true;
        char temp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board,words,i+1,j,len+1) || dfs(board,words,i-1,j,len+1)
                ||dfs(board,words,i,j+1,len+1)||dfs(board,words,i,j-1,len+1);
        board[i][j] = temp;
        return res;
    }


}