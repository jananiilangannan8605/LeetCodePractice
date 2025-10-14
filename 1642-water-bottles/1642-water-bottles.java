class Solution {
    public int numWaterBottles(int b, int a) {
        return b+(b-1)/(a-1);
    }
}