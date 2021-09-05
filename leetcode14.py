#Leetcode #14 Longest Common Prefix

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        str2 = list()
        index = 0
        for i in range(len(strs[0])):
            for j in range(1,len(strs)):
                if i > len(strs[j]) or strs[0][i] != strs[j][i]:
                    return ''.join(str2)
            str2.append(strs[0][i])
        return ''.join(str2)