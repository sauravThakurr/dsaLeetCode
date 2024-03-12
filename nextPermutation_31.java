class Solution {
    public void nextPermutation(int[] nums) {
        int s=nums.length;
        int ind=-1;
        for(int i=s-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                 ind=i;
                 break;
            }
        }
        if(ind==-1)
        {
          nums=reverse(nums,0);
        }
        for(int i=s-1;i>=0;i--)
        {
            if(ind!=-1 && nums[i]>nums[ind] )
            {
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        if(ind!=-1)
      nums=reverse(nums,ind+1);

    }
        public int[] reverse(int nums[], int start) 
    { 
 int i = start, j = nums.length - 1;
        while (i < j) {
            int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }

}