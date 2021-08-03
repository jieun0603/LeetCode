class Solution {
    public boolean isPalindrome(String s) {

        if ("".equals(s)) {
            return false;
        }
        
        s = s.toUpperCase().replaceAll("[^A-Z0-9]", "");
        int len = s.length();
        
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len-i-1)) {
                return false;
            }
        }
        
        return true;
    }
}