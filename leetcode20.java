class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        
        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
            }
            
            if(s.charAt(i) == ')')
            {
                if(stack.empty() == true)
                {
                    return false;
                }
                if(stack.peek() == '(')
                {
                    stack.pop();
                }else
                {
                    answer = false;
                    break;
                }
            }else if(s.charAt(i) == '}')
            {
                if(stack.empty() == true )
                {
                    return false; 
                }
                else if(stack.peek() == '{')
                {
                    stack.pop();
                }else
                {
                    answer = false;
                    break;
                }
            }else if(s.charAt(i) == ']')
            {
                if(stack.empty() == true)
                {
                    return false;
                }
                if(stack.peek() == '[')
                {
                    stack.pop();
                }else
                {
                    answer = false;
                    break;
                }
            }
        }
        
        if(stack.size() >0)
        {
            answer = false;
        }
        
            return answer;
        
        
    }
}