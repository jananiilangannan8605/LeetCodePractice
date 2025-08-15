class Solution {
    public int[] fairCandySwap(int[] as, int[] bs) {
        int asum=0, bsum=0;
        for(int i:as) asum+=i;
        for(int i:bs) bsum+=i;
        int diff=0;
        diff = (asum - bsum) / 2;
        Set<Integer> setB = new HashSet<>();
        for (int b : bs) setB.add(b);
        for (int a : as) {
            int targetB = a - diff;
            if (setB.contains(targetB)) {
                return new int[]{a, targetB};
            }
        }

        return new int[0]; 
         
    }
}