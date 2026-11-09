class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        int fTerm=0;
        int sTerm=1;
        for(int i=1;i<=n;i++){
            int tTerm=fTerm + sTerm;
            fTerm=sTerm;
            sTerm=tTerm;
        }
        return fTerm;
    }
}
