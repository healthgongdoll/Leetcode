//LeetCode problem climing stairs 70번 

//dp 솔루션 
class Solution {
    public int climbStairs(int n) {
        int[]dp = new int[n+1];
        dp[0] = 1; //1 way 
        dp[1] = 1; // 1 way 
        
            for(int i = 2; i<=n; i++)
            {
                dp[i] = dp[i-1] +dp[i-2];
            }
        return dp[n];
    }
}
//Recursion Solution
class Solution {
    public int climbStairs(int n) {
      
        return climb(n);
    }
    public int climb(int n){
        if(n == 0)
        {
            return 1; 
        }
        if(n == 1)
        {
            return 1; 
        }
        return climb(n-1)+climb(n-2);
    }
    
}