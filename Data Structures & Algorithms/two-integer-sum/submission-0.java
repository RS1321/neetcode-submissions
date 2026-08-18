class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
         
            if (seenNumbers.contains(complement)) {
                
                
                for (int j = 0; j < i; j++) {
                    if (nums[j] == complement) {
                        return new int[]{j, i}; 
                    }
                }
            }
            
            seenNumbers.add(nums[i]);
        }
        
        return new int[]{};
    }
}
