class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && k >= Math.abs(i-j)){
                    return true;
                    
                }
            }
        }
        return false;
    }
}
