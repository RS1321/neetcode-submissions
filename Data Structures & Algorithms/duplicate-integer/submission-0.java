class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> check= new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(check.containsKey(nums[i]))
            check.put(nums[i], check.get(nums[i])+1);
            else
            check.put(nums[i],1);
        }
        for(Integer value: check.values()){
            if(value>1)
            return true;
        }
        return false;
    }
}