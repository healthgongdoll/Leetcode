class Solution {

    public int singleNumber(int[] nums) {
    
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                set.remove(nums[i]);
            }else
            {
            set.add(nums[i]);
            }
        }
        System.out.println(set);
        Iterator<Integer> it = set.iterator();
        int answer = it.next();
        return answer;
    }
}
