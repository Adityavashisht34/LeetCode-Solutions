class Solution {
    int partition(int [] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;
        while(i<j){
            while(nums[i]<=pivot){
                i++;
                if(i==nums.length){
                    break;
                }
            }
            while(nums[j]>pivot){
                j--;
                if(j==-1){
                    break;
                }
            }
            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }
    void quickSort(int [] nums, int low, int high){
        if(low<high){
            int pivot = partition(nums, low, high);
            quickSort(nums, low,pivot-1);
            quickSort(nums, pivot+1, high);
        }
    }
    public int findMin(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums[0];
    }
}
