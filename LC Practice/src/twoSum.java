class Solution {
    public int[] twoSum(int[] nums, int target) {
        int endIndex = nums.length;
        //int[] returnArr = new int[2];
        for(int i = 0; i < endIndex; i++){
            for(int x = i+1; x < nums.length; x++){
                if((nums[i] + nums[x]) == target){
                    int[] returnArr = {i,x};
                    return returnArr;
                }
            
            }
        }
        

                int[] arr = {0,0};
                return arr;
      
    }
}
