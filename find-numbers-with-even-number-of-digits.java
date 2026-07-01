class Solution {
    public static int digitCount(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            int count=digitCount(nums[i]);
            if(count%2==0){
                total++;
            }
        }
        return total;
        
    }
}
