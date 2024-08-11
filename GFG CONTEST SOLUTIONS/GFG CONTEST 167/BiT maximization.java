
// BIT MAXIMIZATION PROBLEM SOLUTION

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int x;
            x = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.getMax(x);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    
    static ArrayList<Integer> binary(int num){
        
        ArrayList<Integer>bin=new ArrayList<>();
        int rem;
        while(num>0){
            
            rem=num%2;
            bin.add(rem);
            num=num/2;
            
        }
        
        Collections.reverse(bin);
        
        return bin;
    }
    
    static int dec(ArrayList<Integer>bin){
        
        int num=0;
        int p=0;
        
        for(int i=bin.size()-1;i>=0;i--){
            
            num=num+(bin.get(i)*((int)Math.pow(2,p)));
            p++;
            
        }
        
        return num;
    }
    public static int getMax(int x) {
        // code here
        
        int result=0;
        int index=0;
        int limit=0;
       ArrayList<Integer>bin=binary(x);
       
       while(index<bin.size()){
           
           if(bin.get(index)==1){
               index++;
           }
           
           else{
               bin.set(index,1);
               index=index+2;
               limit++;
               if(limit==2){
                   break;
               }
           }
           
       }
       
       result=dec(bin);
        
        return result;
    }
}
