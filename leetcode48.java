class Solution {
    public void rotate(int[][] matrix) {
        
        //rotate vertically 
        for(int i = 0; i<matrix.length/2; i++)
        {
            for(int j = 0; j<matrix[i].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j] = temp;
            }
        }
        //rotate diagnoally 
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = i; j<matrix[i].length; j++)
            {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
  
    }
}


/*
      Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0;i<matrix.length;i++)
        {
           for(int j = matrix[i].length-1; j>=0;j--)
           {
               queue.add(matrix[j][i]);
           }
        }
        
        for(int i = 0; i<matrix.length;i++)
        {
            for(int j = 0; j<matrix[i].length;j++)
            {
                matrix[i][j] = queue.poll();
            }
        }
        */