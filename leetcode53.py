#LeetCode 53 Maximum Subarray

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        left = 0
        right = len(nums)
        maxSub = nums[0]
        currSum = 0
        
        for i in range(len(nums)):
            if currSum < 0:
                currSum = 0
            currSum = currSum + nums[i]
            maxSub = max(maxSub,currSum)
        
        return maxSub
        
        #윈도우 처럼 생각하면됨
        
        #-2 1 -3 4 -1 2 1 -5 4 
        #We dont have to consider negative numbers 
        #Check -2, 1 = -1 we dont consider -2 , 1 -3 = -2 , we dont consider 1 and -3, 4 -1 = 3 (We start to consider the left index here)
        