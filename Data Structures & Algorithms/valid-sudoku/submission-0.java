class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Hash set for each row,col,box of size 9
        HashSet<Character> row[] = new HashSet[9];
        HashSet<Character> col[] = new HashSet[9];
        HashSet<Character> box[] = new HashSet[9];
        // fill them with hashsets
        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        int n = 9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                // check if char is present in row,col,box computed till now
                if(row[i].contains(board[i][j])||col[j].contains(board[i][j])||box[((i/3)*3)+(j/3)].contains(board[i][j])){
                    return false;
                }
                // if not add them
                row[i].add(board[i][j]);
                col[j].add(board[i][j]);
                box[((i/3)*3)+(j/3)].add(board[i][j]);
            }
        }
        return true;
    }
}
