class Solution {
    public boolean isSameAfterReversals(int num) {
        for(int i=0;i<=num;i++){
           if(num==0){
                return num== 0;
            }
            
        }
        return num%10!=0;
    }

}
