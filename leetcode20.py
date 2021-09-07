#Leetcode #20 Valid Parentheses 

class Solution:
    def isValid(self, s: str) -> bool:
        if s is None:
            return False
        else:
            list1 = []
            index = 0
            for i in range(len(s)):
                if not list1:
                    list1.append(s[i])
                    index = index + 1
                elif list1[index - 1] is '{' and s[i] is '}':
                    list1.pop()
                    index = index - 1 
                elif list1[index - 1] is '[' and s[i] is ']': #리스트 네이밍 실수함
                    list1.pop()
                    index = index - 1
                elif list1[index - 1] is '(' and s[i] is ')':  # 리스트 네이밍 실수함 반성하자 ㅎㅎ
                    list1.pop()
                    index = index - 1
                else: 
                    list1.append(s[i])
                    index = index + 1

            if not list1:
                return True
            else:
                return False