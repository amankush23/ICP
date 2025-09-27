class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0; 
        int hi = num;
        while(low <= hi){
            long mid = low + (hi-low)/2;
            if(mid*mid == num) return true;
            if(mid*mid > num) hi = (int)mid-1;
            else{
                low =(int) mid+1;
            }
        }
        return false;
    }
}
