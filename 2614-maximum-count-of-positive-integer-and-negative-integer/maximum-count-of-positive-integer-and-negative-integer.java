class Solution {
    public int maximumCount(int[] nums) {
        int p_count = 0;
         int n_count = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i]> 0){
            //  p_count += nums[i];
             p_count++;
            }
            if (nums[i] < 0 ){
                n_count++;
            }
        }
        return Math.max(p_count, n_count);
      
       
    }
}