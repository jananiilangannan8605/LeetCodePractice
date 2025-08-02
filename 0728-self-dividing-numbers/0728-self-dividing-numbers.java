class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean check(int i){
        int temp=i;
        while(i>0){
            int rem=i%10;
            if(rem==0||temp%rem!=0){
                return false;
            }
            i/=10;
        }
        return true;
    }
}