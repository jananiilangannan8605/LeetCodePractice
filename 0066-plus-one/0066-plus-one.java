class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag=true;
       for(int i=digits.length-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            for(int j=0;j<digits.length;i++){
                return digits;
            }
            flag=false;
            break;
        }
        else{
            digits[i]=0;
        }
       }
       if(flag){
        int[] res=new int[digits.length+1];
        res[0]=1;
        for(int i=0;i<res.length;i++){
            return res;
        }
       }
return digits;
       }
    }