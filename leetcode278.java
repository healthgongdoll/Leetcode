/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      
        int low = 1; 
        int high = n; 
        
        while(low < high)
        {
            int mid = low+(high-low)/2; // overflow 때문에 항상 이렇게 해줘야됨 명심
            
            if(isBadVersion(mid) == true)
            {
                high = mid;
            }else
            {
                low = mid+1;
            }
        }
        return low;
    }
}