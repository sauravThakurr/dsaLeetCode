class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix=markRow(matrix,i);
                    matrix=markCol(matrix,j);
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==-1)
                matrix[i][j]=0;
            }
        }

    }
    public int [][] markRow(int [][] matrix,int row)
    {
        for(int col=0;col<matrix[0].length;col++)
        {
            if(matrix[row][col]!=0)
            {
            matrix[row][col]=-1;
               } 
        }
        return matrix;
    }
    public int[][] markCol(int[][]matrix,int col)
    {
        for( int row=0;row<matrix.length;row++)
        {
            if(matrix[row][col]!=0)
            {
                matrix[row][col]=-1;
            }
            
        }
        return matrix;
    }
}