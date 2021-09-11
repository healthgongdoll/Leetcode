// 17 Letters Combinations of a Phone Number 
// 다시 풀어보기 
class Solution {
    public List<String> letterCombinations(String digits) {
   
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0)
        {
            return result;
        }
        
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        Letter(result, digits,"",0,mapping);
        
        return result;
    }
    public void Letter(List<String> result, String digits, String current, int index, String[]mapping)
    {
        if(index == digits.length()) // no numbers to proceed
        {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        
        for (int i = 0; i<letters.length();i++)
        {
            Letter(result,digits,current+letters.charAt(i),index+1,mapping);
        }
    }
}