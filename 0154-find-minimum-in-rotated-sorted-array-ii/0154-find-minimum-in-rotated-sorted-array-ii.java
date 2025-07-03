class Solution {
    public int findMin(int[] arr) {
        // Arrays.sort(nums);
        // return nums[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            int swap=0;
    for (int j = 0; j < i; j++) { // Corrected here: j++
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j + 1];
            arr[j + 1] = arr[j];
            arr[j] = temp;
            swap++;
        }
    }
    if(swap==0){
        break;
    }
}
        return arr[0];
    }
}