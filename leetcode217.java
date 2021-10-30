class Solution {
    public boolean containsDuplicate(int[] nums) {
      
       HashSet<Integer> st = new HashSet<Integer>();
        
        for(int i = 0; i<nums.length;i++)
        {
            if(st.contains(nums[i]) == true)
            {
                return true;
            }
            st.add(nums[i]);
        }
        return false;
    }
}

// Java Hashset 
// add O(1)
// contains O(1)
// next O(h/n) h = volume of table
// saving element inorder , do not add duplicates 
// allows null