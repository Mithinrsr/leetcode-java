class Solution {
    public boolean isPalindrome(int x) {
       String a=""+x;
        int s=0;
        int end=a.length()-1;
        while(s<=end){ 
            if(a.charAt(s)!=a.charAt(end)){
                return false;
            }
            s++;
            end--;
            }
       return true;
    }
}
