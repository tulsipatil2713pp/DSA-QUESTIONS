class Solution {
    public boolean checkDivisibility(int n) {  
        int original=n;    
        int digisum=0;
        int digipro=1;
        
        while(n>0){
          digisum+=n%10;
          digipro*=n%10;
          n/=10;

          System.out.print(digisum);
        } 
        int x=digisum+digipro;     
        if(x==0){
            return false;
        }
        return original%x==0;
    }
}
