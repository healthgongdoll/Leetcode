//#17 Letter Combination of a Phone Number
class Solution {
    
    public List<String> answer = new ArrayList<String>();
    public  String [] numbers = {
            "0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
    public List<String> letterCombinations(String digits) {
       
        if(digits.equals(""))
        {
            return answer;
        }
        int index = 0;
        
        //"234"
        char [] digit = digits.toCharArray();
        
        backtracking(digit, index, digit.length,"");
        
        return answer;
    }
    
    public void backtracking(char[] digit, int index, int boundary, String letter)
    {
        if(index == boundary)
        {
            answer.add(letter);
            return;
        }
        
        for(int i = 0; i<numbers[digit[index]-48].length();i++)
        {
            backtracking(digit,index+1,boundary,letter+numbers[digit[index]-48].charAt(i));
        }
    }
}