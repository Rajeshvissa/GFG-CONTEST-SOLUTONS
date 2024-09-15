
class Solution {
    public static int winnerTeam(int N, int[] X, int[] Y, int[] Z) {
        // code here
        
        Arrays.sort(X);
        Arrays.sort(Y);
        Arrays.sort(Z);
        
        if((X[N-1]>=Y[N-1]) && (X[N-1]>=Z[N-1])){
            return 0;
        }
        else if(Y[N-1]>=Z[N-1] && Y[N-1]>=X[N-1]){
            return 1;
        }
        
        else{
            return 2;
        }
    }
}
