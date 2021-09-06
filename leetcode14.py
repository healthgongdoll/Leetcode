#Leetcode #14 Longest Common Prefix

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if strs == None:
            return None
        else:
            list1 = list()
            for i in range(len(strs[0])):
                #f l o w e r 을 (한글자씩)
                # flow 
                # flight 이랑 비교 
                for j in range(1,len(strs)):
                    if i >= len(strs[j]) or strs[j][i] != strs[0][i]:  #if 의 순서도 중요하다 
                        # i >= len(strs[j]) 랑 strs[j][i] != strs[0][i] 랑 순서를 바꿨을때 에러났음 
                        return ''.join(list1)
                list1.append(strs[0][i])
            return ''.join(list1)