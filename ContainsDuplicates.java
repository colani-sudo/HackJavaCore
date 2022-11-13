import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> mySet = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            mySet.add(Integer.valueOf(nums[i]));
        }
        
        if(mySet.size() < nums.length){
            return true;
        }
        return false;
    }
}
