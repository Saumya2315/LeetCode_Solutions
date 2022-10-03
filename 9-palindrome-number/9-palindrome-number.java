class Solution {
    public boolean isPalindrome(int x) {
        int d = 0;
        int t=0;
        int copy=x;
        if(x<0){
            return false;
        }
        while(x>0){
            d=x%10;
            t = t*10 + d;
            x=x/10;
        }
        if(copy==t){
            return true;
        }
        return false;
    }
}