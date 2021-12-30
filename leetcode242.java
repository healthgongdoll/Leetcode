class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha1 = new int[26];
            int[] alpha2 = new int[26];
           boolean answer = true;
        for(int i = 0; i<s.length();i++)
        {
            alpha1[s.charAt(i)-'a']++;
        }
          for(int i = 0; i<t.length();i++)
        {
            alpha2[t.charAt(i)-'a']++;
        }
        
        for(int i = 0; i<26; i++)
        {
            if(alpha1[i] != alpha2[i])
            {
                return false;
            }
        }
        
        return true;
    }
}