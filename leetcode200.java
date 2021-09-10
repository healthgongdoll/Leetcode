//Leetcode 200 Number of Island
//다시풀어보기 

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        

        for (int i = 0; i<grid.length;i++){
            for (int j = 0; j<grid[0].length; j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(grid,i,j,grid.length,grid[0].length); // 4방향 + 마킹
                    count++;
                    
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int currX, int currY,int row, int column )
    {
        //boundary check 
        if(currX < 0 || currX >= row || currY < 0 || currY >= column || grid[currX][currY] != '1')
        {
            return;
        }
        grid[currX][currY] = '2';
        dfs(grid,currX+1,currY,row,column); // DOWN
        dfs(grid,currX,currY+1,row,column); // RIGHT
        dfs(grid,currX-1,currY,row,column); // UP
        dfs(grid,currX,currY-1,row,column); // LEFT
    }
}