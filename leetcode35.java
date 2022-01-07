class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1; 
        int index = 0;
        boolean check = false;
        int mid = 0;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            
            if(nums[mid] == target)
            {
                return mid;
            }else if(target < nums[mid])
            {
                high = mid-1;
                check = true;
            }else
            {
                low = mid+1;
            }
        }
        
      return low;
 
    }
}