class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap();
        
        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<Integer> list = new ArrayList();
        
        for(int num: nums2)
        {
            int count = map.getOrDefault(num,0);
            if(count > 0){
                list.add(num);
                map.put(num,count-1);
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for(int num: list)
        {
          res[i++] = num;
        }
        return res;
    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        int l1 = nums1.length;
        int l2 = nums2.length;
          Arrays.sort(nums1);
         Arrays.sort(nums2);
        int[] ans = new int[l1 * l2];
        int i = 0, j= 0, k = 0;
        while (i < l1 && j < l2)
        {
            if(nums1[i] < nums2[j])
            {
                i++;
            }
           else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else if(nums1[i] == nums2[j]){
  
                ans[k] = nums1[i];
                k++;
                i++;
                j++;
                
            }
        }
        
        return Arrays.copyOfRange(ans,0,k);
    }
}