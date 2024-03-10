class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>(); 
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> temp= helper(i);
            ans.add(temp);
        }
        return ans;
    }
    public List<Integer> helper(int row)
    {
        List<Integer> a=new ArrayList<>();
        a.add(1);
        int ans=1;
        int col=1;
        for(int i=1; i<row;i++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            col++;
            a.add(ans);
        }
        return a;
            }
}