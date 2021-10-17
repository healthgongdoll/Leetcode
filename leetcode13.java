class Solution {
    public int romanToInt(String s) {
        
         char[] arr = {'M','D','C','L','X','V','I'};
        int [] nums = {1000,500,100,50,10,5,1};
        int answer = 0; 
        
      for(int i= 0; i<s.length();++i)
      {
    	  for(int j = 0; j<arr.length;j++)
    	  {
    		  if(s.charAt(i) == arr[j])
    		  {
    			  if(i+1 < s.length())
    			  {
    			  if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M')
    			  	{
    				  answer += 900;
    				  i++;
    				  break;
    			  	}
    			  else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D')
  			  		{
    				  answer += 400;
    				  i++;
    				  break;
  			  		}
    			  else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C')
  			  		{
    				  answer += 90;
    				  i++;
    				  break;
  			  		}
    			  else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L')
  			  		{
    				  answer += 40;
    				  i++;
    				  break;
  			  		} else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X')
  			  		{
      				  answer += 9;
      				 i++;
   				  break;
    			  	} else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V')
      			  	{
    	    				  answer += 4;
    	    				  i++;
    	    				  break;
    	  			  }
    			  
    			 
    			  }
    			  answer += nums[j];
    		  }
    	  }
      }
        
        return answer;
    }
}