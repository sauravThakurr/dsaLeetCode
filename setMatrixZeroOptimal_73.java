class Solution {
    public void setZeroes(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;
        int c=-1;
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(j==0)
                    c=0;
                    else
                    {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                    }
                }
            }
        }
                for(int i=1;i<row;i++)
        {
            for (int j=1;j<col;j++)
            {
               if(matrix[i][0]==0||matrix[0][j]==0)
               matrix[i][j]=0;
            }
        }
        if(matrix[0][0]==0)
        {
            for(int i=0;i<col;i++)
            {
                matrix[0][i]=0;
            }
        }
                if(c==0)
        {
            for(int i=0;i<row;i++)
            {
                matrix[i][0]=0;
            }
        }
        
        
    }
}