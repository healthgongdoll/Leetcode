class Solution {
    public void rotate(int[] nums, int k) {
      
        int len = nums.length;
        k %= len; // This is for the outer bound of the k 
        reverse(nums,0,len-1); // reverse of whole array
        reverse(nums,0,k-1);
        // reverse the first part
        reverse(nums,k,len-1);
        // reverse the second part
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*
   for(int i = 0; i<k; i++)
        {
            for(int j = 1;j<nums.length; j++)
            {   
               int temp = nums[j];
                nums[j] = nums[0];
                nums[0] = temp;
            }
            
        }
*/