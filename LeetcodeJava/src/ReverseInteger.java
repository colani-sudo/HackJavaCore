public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0  ;

        while(x != 0){
            int rem = x % 10 ;
            x /= 10 ;
            //we need to check for the rem>7 and rem<-8 conditions
            //that is, check the maximum boundary (2147483647) before multiplying by 10
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && rem > 7){
                return 0 ;
            }
            //and check the minimum boundary (-2147483648) before multiplying by 10
            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && rem < -8){
                return 0 ;
            }

            rev = rev*10 + rem ;
        }

        return rev ;
    }
}
