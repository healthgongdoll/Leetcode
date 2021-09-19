class Solution {
    boolean answer = false;
    boolean [][]visited;
    public boolean exist(char[][] board, String word) {
           
            int currI = 0;
            int currJ = 0; 
            int count = 0;
            int height = board.length;
            int width = board[0].length;
            visited = new boolean[height][width];
        
            for(int i = 0; i<height; i++)
            {
                for(int j = 0; j<width;j++)
                {
                    if(answer == true)
                    {
                        continue;
                    }
                    if(board[i][j] == word.charAt(0))
                    {
                        currI = i;
                        currJ = j;
                        dfs(board,word,currI,currJ,width,height,count,visited);
                    }
                }
            }
        
       return answer; 
  
            
    }
    
    public void dfs(char[][] board,String word, int currI, int currJ, int width, int height, int count,boolean [][] visited)
    {
          
        if(currI >= height || currI < 0 || currJ >= width || currJ < 0 || board[currI][currJ] != word.charAt(count) || visited[currI][currJ] == true)
        {
                return;
        }
        count+=1;
        visited[currI][currJ] = true;
        if(count == word.length())
        {
            answer = true;
            return;
        }
        dfs(board,word,currI+1,currJ,width,height,count,visited);
        dfs(board,word,currI-1,currJ,width,height,count,visited);
        dfs(board,word,currI,currJ+1,width,height,count,visited);
        dfs(board,word,currI,currJ-1,width,height,count,visited);
        visited[currI][currJ] = false;
        
    }
    
    
}