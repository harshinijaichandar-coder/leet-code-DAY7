class Solution {
    public static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=sumOfDigits(x);
        if(x%sum==0){
            return sum;
        }
        return -1;
        
        
    }
}
