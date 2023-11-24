class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int [] ansArray = new int[2];
        for( i = 0; i<nums.length; i++){
            for( j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    ansArray[0] = i;
                    ansArray[1] = j;
                    return ansArray;
                }
            }
        }
        return ansArray;
    }
}
