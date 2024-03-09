class Solution {
    public void setZeroes(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;
        int [] Erow=new int[row];
        int [] Ecol=new int[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {

                if(matrix[i][j]==0)
                {
                    Erow[i]=-1;
                    Ecol[j]=-1;
                }
            }
        }
            for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                
                if(Erow[i]==-1 ||Ecol[j]==-1)
                {
                   matrix[i][j]=0;
                }
            }
        }
        
    }
}