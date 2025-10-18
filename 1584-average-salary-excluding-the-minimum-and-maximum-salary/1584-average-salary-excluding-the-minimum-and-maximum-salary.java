class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int val=salary[0]+salary[salary.length-1];
        int sum=0;
        for(int i:salary){
            sum+=i;
        }
        double value=(double)(sum-val)/(salary.length-2);
        return value;
    }
}