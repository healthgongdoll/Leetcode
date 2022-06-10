class Solution {
    public int[] plusOne(int[] digits) {
      //9999
        0
        for(int i = digits.length-1; i>=0; i--)
        {
            if(digits[i] == 9)
            {
                digits[i] = 0;
            }else
            {
                digits[i]++;
                return digits;
            }
        }
        
        int [] sol = new int[digits.length+1];
        
        sol[0] = 1; // if the number is 9999 - it should be 10000 -> if u just do sol[0] =1 rest of the number will be 0. 
        return sol;
      
    }
}