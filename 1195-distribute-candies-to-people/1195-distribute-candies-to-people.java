class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int give = 1; // start giving 1 candy

        int index = 0; 
        while (candies > 0) {
            if (candies >= give) {
                arr[index] += give;
                candies -= give;
            } else {
                arr[index] += candies; // give remaining candies
                candies = 0;
            }
            give++;
            index = (index + 1) % num_people; // move to next person in round-robin
        }
        return arr;
    }
}
