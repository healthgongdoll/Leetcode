class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        
        if((rows * columns) != (r*c)) return mat;
        
        int[][] answer = new int[r][c];
        int row_num = 0;
        int column_num = 0;
        
        for(int i = 0; i<rows;i++)
        {
            for(int j = 0; j<columns;j++)
            {
                answer[row_num][column_num] = mat[i][j];
                System.out.print(answer[row_num][column_num]);
                column_num++;
                if(column_num == c)
                {
                    column_num = 0;
                    row_num++;
                }
            }
            System.out.println();
        }
        
        return answer;
    }
}