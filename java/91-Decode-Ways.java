class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        
        int[] dp = new int[n+1];
        
        dp[0]=1;
        dp[1]= (s.charAt(0) !='0') ? 1: 0;
        
        for(int i =2;i<=n;i++){
            int f1 = Integer.valueOf(s.substring(i-1,i));
            int f2 = Integer.valueOf(s.substring(i-2,i));
            
            if(f1>=1 && f1<=9){
                dp[i] += dp[i-1];
            }
            
             if(f2>=10 && f2<=26){
                dp[i] += dp[i-2];
            }
        }
        
        return dp[n];
    }
}
